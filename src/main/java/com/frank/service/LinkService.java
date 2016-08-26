package com.frank.service;

import com.frank.dao.LinkDao;
import com.frank.entity.Link;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
@Service
public class LinkService {
    @Resource
    private LinkDao linkDao;

    public int add(Link link) {
        return linkDao.add(link);
    }

    public int update(Link link) {
        return linkDao.update(link);
    }

    public List<Link> list(Map<String, Object> map) {
        return linkDao.list(map);
    }

    public Long getTotal(Map<String, Object> map) {
        return linkDao.getTotal(map);
    }

    public Integer delete(Integer id) {
        return linkDao.delete(id);
    }
}
