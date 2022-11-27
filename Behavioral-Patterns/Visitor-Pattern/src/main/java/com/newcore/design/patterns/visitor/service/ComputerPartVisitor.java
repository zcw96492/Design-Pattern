package com.newcore.design.patterns.visitor.service;

import com.newcore.design.patterns.visitor.service.part.Computer;
import com.newcore.design.patterns.visitor.service.part.Keyboard;
import com.newcore.design.patterns.visitor.service.part.Monitor;
import com.newcore.design.patterns.visitor.service.part.Mouse;

/**
 * 计算机公共访问者接口
 * @author zhouchaowei
 */
public interface ComputerPartVisitor {

    /**
     * 通过计算机访问
     * @param computer 计算机对象
     */
    void visit(Computer computer);

    /**
     * 通过鼠标访问
     * @param mouse 鼠标对象
     */
    void visit(Mouse mouse);

    /**
     * 通过键盘访问
     * @param keyboard 键盘对象
     */
    void visit(Keyboard keyboard);

    /**
     * 通过显示器访问
     * @param monitor 显示器对象
     */
    void visit(Monitor monitor);
}
