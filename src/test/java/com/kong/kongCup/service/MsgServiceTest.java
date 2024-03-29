package com.kong.kongCup.service;

import com.kong.kongCup.module.MsgVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MsgServiceTest {

    @Autowired
    MsgService msgService;

    @Test
    void getMsg() {
        MsgVO msgVO = msgService.getMsg();
        Assert.notNull(msgVO);
    }

    @Test
    void getMsgShouldFail() {
        MsgVO msgVO = msgService.getMsg();
        assertEquals(msgVO.getAuthor(), "海明威");
    }

    @Test
    void getMsgShouldFail2() {
        MsgVO msgVO = msgService.getMsg();
        assertEquals(msgVO.getAuthor(), "刀尔登");
    }
}