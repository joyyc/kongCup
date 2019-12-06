/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.kong.kongCup.controller;

import com.kong.kongCup.module.MsgVO;
import com.kong.kongCup.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KongXian
 * @version $Id: MsgController.java, v 0.1 2019年12月06日 10:24 AM KongXian Exp $
 */
@RestController
public class MsgController {
    @Autowired
    MsgService msgService;

    @GetMapping("/msg")
    public MsgVO getMsg() {
        return msgService.getMsg();
    }
}