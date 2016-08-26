package com.frank.service;

import com.frank.dao.CommentDao;
import com.frank.entity.Comment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
@Service
public class CommentService {
    @Resource
    private CommentDao commentDao;

    public int add(Comment comment) {
        return commentDao.add(comment);
    }

    public List<Comment> list(Map<String, Object> map) {
        return commentDao.list(map);
    }

    public Long getTotal(Map<String, Object> map) {
        return commentDao.getTotal(map);
    }

    public Integer delete(Integer id) {
        return commentDao.delete(id);
    }

    public int update(Comment comment) {
        return commentDao.update(comment);
    }
}
