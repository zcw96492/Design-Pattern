package com.newcore.design.patterns.visitor.service;

/**
 * 计算机主机部分接口
 * @author zhouchaowei
 */
public interface ComputerPart {

    /**
     * 接受指令
     * @param computerPartVisitor 访问者对象
     */
    void accept(ComputerPartVisitor computerPartVisitor);
}
