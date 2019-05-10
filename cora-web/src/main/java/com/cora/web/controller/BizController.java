package com.cora.web.controller;

import com.cora.service.BizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 *
 * @Author: fanmingtao
 * @Date: 2019/5/10
 */
@RestController
@RequestMapping("biz")
public class BizController {

    @Autowired
    private BizService bizService;

    @GetMapping("findName/{userId}")
    public String findUserName(@PathVariable Long userId) {
        String userName = bizService.findUserName(userId);
        return userName;
    }
}
