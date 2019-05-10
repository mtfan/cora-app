package com.cora.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 *
 * @Author: fanmingtao
 * @Date: 2019/5/10
 */
@RestController
@RequestMapping
public class MonitorController {

    /**
     * 监控接口
     */
    @RequestMapping(value = "/monitor")
    public String getMonitor() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errorCode", "0000000");
        jsonObject.put("errorMessage", "success");
        jsonObject.put("succeed", true);
        jsonObject.put("data", "current service is ok");
        return jsonObject.toJSONString();
    }
}
