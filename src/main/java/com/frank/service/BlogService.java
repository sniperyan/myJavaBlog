package com.frank.service;

import com.frank.dao.BlogDao;
import com.frank.entity.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
@Service
public class BlogService {
    private static Logger logger  = LoggerFactory.getLogger(BlogService.class);
    @Resource
    private BlogDao blogDao;

    public List<Blog> countList() {
        return blogDao.countList();
    }

    public List<Blog> list(Map<String, Object> map) {
        return blogDao.list(map);
    }

    public Long getTotal(Map<String, Object> map) {
        return blogDao.getTotal(map);
    }

    public Blog findById(Integer id) {
        return blogDao.findById(id);
    }

    public Integer update(Blog blog) {
        return blogDao.update(blog);
    }

    public Blog getLastBlog(Integer id) {
        return blogDao.getLastBlog(id);
    }

    public Blog getNextBlog(Integer id) {
        return blogDao.getNextBlog(id);
    }

    public Integer add(Blog blog) {
        return blogDao.add(blog);
    }

    public Integer delete(Integer id) {
        return blogDao.delete(id);
    }

    public Integer getBlogByTypeId(Integer typeId) {
        return blogDao.getBlogByTypeId(typeId);
    }
}
