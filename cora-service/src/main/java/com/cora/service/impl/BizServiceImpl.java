package com.cora.service.impl;

import com.cora.common.util.DateUtil;
import com.cora.dao.UserDao;
import com.cora.service.BizService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description:
 *
 * @Author: fanmingtao
 * @Date: 2019/5/10
 */
@Slf4j
@Service
public class BizServiceImpl implements BizService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询用户姓名
     *
     * @param userId
     * @return
     */
    @Override
    public String findUserName(Long userId) {
        Date date = DateUtil.date2Date(new Date(), DateUtil.PATTERN_CLASSICAL_NORMAL);
        log.info("DateUtil date2Date return result:" + date.toString());
        String userName = userDao.findUserName(userId);
        log.info("userDao return result:" + userName);

        if (userId == null) {
            return "UserId must be not null!";
        }
        return "UserName is __" + userId;
    }
}
