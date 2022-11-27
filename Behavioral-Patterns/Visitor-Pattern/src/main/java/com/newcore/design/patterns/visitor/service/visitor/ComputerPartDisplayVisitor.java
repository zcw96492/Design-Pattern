package com.newcore.design.patterns.visitor.service.visitor;

import com.newcore.design.patterns.visitor.service.ComputerPartVisitor;
import com.newcore.design.patterns.visitor.service.part.Computer;
import com.newcore.design.patterns.visitor.service.part.Keyboard;
import com.newcore.design.patterns.visitor.service.part.Monitor;
import com.newcore.design.patterns.visitor.service.part.Mouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 计算机公共访问者接口实现类
 * @author zhouchaowei
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    private static final Logger logger = LoggerFactory.getLogger(ComputerPartDisplayVisitor.class);

    /**
     * 通过计算机访问
     * @param computer 计算机对象
     */
    @Override
    public void visit(Computer computer) {
        logger.info("Displaying Computer...");
    }

    /**
     * 通过鼠标访问
     * @param mouse 鼠标对象
     */
    @Override
    public void visit(Mouse mouse) {
        logger.info("Displaying Mouse...");
    }

    /**
     * 通过键盘访问
     * @param keyboard 键盘对象
     */
    @Override
    public void visit(Keyboard keyboard) {
        logger.info("Displaying Keyboard...");
    }

    /**
     * 通过显示器访问
     * @param monitor 显示器对象
     */
    @Override
    public void visit(Monitor monitor) {
        logger.info("Displaying Monitor...");
    }
}
