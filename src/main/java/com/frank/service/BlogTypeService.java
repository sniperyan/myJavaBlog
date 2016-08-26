package com.frank.service;

import com.frank.dao.BlogTypeDao;
import com.frank.entity.BlogType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
@Service
public class BlogTypeService {
    @Resource
    private BlogTypeDao blogTypeDao;

    public List<BlogType> countList() {
        return blogTypeDao.countList();
    }

    public List<BlogType> list(Map<String, Object> map) {
        return blogTypeDao.list(map);
    }

    public Long getTotal(Map<String, Object> map) {
        return blogTypeDao.getTotal(map);
    }

    public Integer add(BlogType blogType) {
        return blogTypeDao.add(blogType);
    }

    public Integer update(BlogType blogType) {
        return blogTypeDao.update(blogType);
    }

    public Integer delete(Integer id) {
        return blogTypeDao.delete(id);
    }
}
