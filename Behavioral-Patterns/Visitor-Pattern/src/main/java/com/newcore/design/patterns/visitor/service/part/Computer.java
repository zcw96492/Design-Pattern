package com.newcore.design.patterns.visitor.service.part;

import com.newcore.design.patterns.visitor.service.ComputerPart;
import com.newcore.design.patterns.visitor.service.ComputerPartVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 计算机
 * @author zhouchaowei
 */
public class Computer implements ComputerPart {

    private static final Logger logger = LoggerFactory.getLogger(Computer.class);

    private final ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {
                new Mouse(), new Keyboard(), new Monitor()
        };
    }

    /**
     * 接受指令
     * @param computerPartVisitor 访问者对象
     */
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
