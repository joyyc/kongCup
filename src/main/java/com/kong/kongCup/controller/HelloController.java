/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.kong.kongCup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KongXian
 * @version $Id: HelloController.java, v 0.1 2019年12月06日 10:04 AM KongXian Exp $
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "something";
    }
}