package com.newcore.design.patterns.visitor.service.part;

import com.newcore.design.patterns.visitor.service.ComputerPart;
import com.newcore.design.patterns.visitor.service.ComputerPartVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 鼠标实现类
 * @author zhouchaowei
 */
public class Mouse implements ComputerPart {

    private static final Logger logger = LoggerFactory.getLogger(Mouse.class);

    /**
     * 接受指令
     * @param computerPartVisitor 访问者对象
     */
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
