/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.kong.kongCup.service.impl;

import com.kong.kongCup.module.MsgVO;
import com.kong.kongCup.service.MsgService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author KongXian
 * @version $Id: MsgServiceImpl.java, v 0.1 2019年12月06日 10:15 AM KongXian Exp $
 */
@Service
public class MsgServiceImpl implements MsgService {

    @Value("${msg.author}")
    private String author;
    @Value("${msg.text}")
    private String text;
    @Value("${msg.photoUrl}")
    private String photoUrl;

    @Override
    public MsgVO getMsg() {
        //从文件中解析？从DB中获取？
        MsgVO msgVO = new MsgVO(author, text, photoUrl);
        return msgVO;
    }
}