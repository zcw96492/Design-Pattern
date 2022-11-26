package com.newcore.design.patterns.mediator.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 聊天室中介类
 * (多个用户可以向聊天室发送消息,聊天室向所有的用户显示消息.)
 * @author zhouchaowei
 */
public class ChatRoom {

    private static final Logger logger = LoggerFactory.getLogger(ChatRoom.class);

    /**
     * 显示聊天信息方法(多个用户可以向聊天室发送消息,聊天室向所有的用户显示消息.)
     * @param user 用户
     * @param message 消息
     */
    public static void showMessage(User user,String message){
        logger.info("[{}]：{}",user.getName(),message);
    }
}
