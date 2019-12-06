/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.kong.kongCup.module;

import lombok.Data;

/**
 *
 * @author KongXian
 * @version $Id: MsgVO.java, v 0.1 2019年12月06日 10:12 AM KongXian Exp $
 */
@Data
public class MsgVO {
    /**
     * 左上角 题目 如 "U心语"
     */
    protected String title;

    /**
     * 文摘作者
     */
    protected String author;

    /**
     * 文摘
     */
    protected String text;
    /**
     * 文摘出处
     */
    protected String from;
    /**
     * 图作者
     */
    protected String painter;
    /**
     * 图片地址
     */
    protected String photoUrl;

    public MsgVO(String author, String text, String photoUrl) {
        this.author = author;
        this.text = text;
        this.photoUrl = photoUrl;
    }
}