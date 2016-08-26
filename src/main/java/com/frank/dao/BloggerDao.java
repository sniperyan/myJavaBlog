package com.frank.dao;

import com.frank.entity.Blogger;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
public interface BloggerDao {
    /**
     * 查询博主信息
     * @return
     */
    public Blogger find();

    /**
     * 通过用户名查询用户
     * @param userName
     * @return
     */
    public Blogger getByUserName(String userName);

    /**
     * 更新博主信息
     * @param blogger
     * @return
     */
    public Integer update(Blogger blogger);
}
