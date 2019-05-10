package com.cora.dao;

/**
 * @Description:
 *
 * @Author: fanmingtao
 * @Date: 2019/5/10
 */

public interface UserDao {

    /**
     * 查找用户名称
     *
     * @param userId
     * @return
     */
    String findUserName(Long userId);
}
