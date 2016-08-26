package com.frank.service;

import com.frank.dao.BloggerDao;
import com.frank.entity.Blogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
@Service
public class BloggerService {
    private static Logger logger  = LoggerFactory.getLogger(BloggerService.class);

    @Resource
    private BloggerDao bloggerDao;

    public Blogger find() {
        return bloggerDao.find();
    }

    public Blogger getByUserName(String userName) {
        return bloggerDao.getByUserName(userName);
    }

    public Integer update(Blogger blogger) {
        return bloggerDao.update(blogger);
    }
}
