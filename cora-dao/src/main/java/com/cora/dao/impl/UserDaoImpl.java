package com.cora.dao.impl;

import com.cora.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * @Description:
 *
 * @Author: fanmingtao
 * @Date: 2019/5/10
 */
@Service
public class UserDaoImpl implements UserDao {
    /**
     * 查找用户名称
     *
     * @param userId
     * @return
     */
    @Override
    public String findUserName(Long userId) {
        return "Test Dao";
    }
}
