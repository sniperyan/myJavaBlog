package com.frank.controller;

/**
 * Created by Administrator on 2016/4/24 0024.
 */

import com.frank.entity.Blog;
import com.frank.entity.PageBean;
import com.frank.entity.PageInfo;
import com.frank.service.BlogService;
import com.frank.util.PageUtil;
import com.frank.util.StringUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 主页controller
 * @author franklee
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Resource
    private BlogService blogService;


    /**
     * 请求主页
     * @return
     * @param page 第几页
     * @param typeId  博客类型编号
     * @param releaseDateStr 发布日期
     * @throws Exception
     */
    @RequestMapping("/index")
    public ModelAndView index(@RequestParam(value="page",required=false)String page,@RequestParam(value="typeId",required=false)String typeId,@RequestParam(value="releaseDateStr",required=false)String releaseDateStr,HttpServletRequest request)throws Exception{
        ModelAndView mav=new ModelAndView();
        if(StringUtil.isEmpty(page)){
            page="1";
        }
        //默认大小一页展示10篇
        PageBean pageBean=new PageBean(Integer.parseInt(page),10);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        map.put("typeId", typeId);
        map.put("releaseDateStr", releaseDateStr);
        List<Blog> blogList=blogService.list(map);
        for(Blog blog:blogList){
            List<String> imagesList=blog.getImagesList();
            String blogInfo=blog.getContent();
            Document doc=Jsoup.parse(blogInfo);
            Elements jpgs=doc.select("img[src$=.jpg]"); //　查找扩展名是jpg的图片
            for(int i=0;i<jpgs.size();i++){
                Element jpg=jpgs.get(i);
                imagesList.add(jpg.toString());
                if(i==2){
                    break;
                }
            }
        }
        mav.addObject("blogList", blogList);
        long totalRows = blogService.getTotal(map);
        PageInfo pageInfo = new PageInfo(Integer.parseInt(page),10,(Integer.parseInt(page)-1)*10,totalRows,typeId,releaseDateStr);
        mav.addObject("pageInfo",pageInfo);
        mav.addObject("mainPage", "foreground/blog/list.jsp");
        mav.addObject("pageTitle","Frank Lee 的博客");
		/*通过ModelAndView构造方法可以指定返回的页面名称，
		也可以通过setViewName()方法跳转到指定的页面 ,
		使用addObject()设置需要返回的值*/
        mav.setViewName("mainTemp");
        return mav;
    }

    /**
     * 源码下载
     * @return
     * @throws Exception
     */
    @RequestMapping("/download")
    public ModelAndView download()throws Exception{
        ModelAndView mav=new ModelAndView();
        mav.addObject("mainPage", "foreground/system/download.jsp");
        mav.addObject("pageTitle","本站源码下载页面_Java开源博客系统");
        mav.setViewName("mainTemp");
        return mav;
    }
}
