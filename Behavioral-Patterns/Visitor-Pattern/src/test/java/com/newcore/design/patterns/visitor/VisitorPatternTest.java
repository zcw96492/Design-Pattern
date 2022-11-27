package com.newcore.design.patterns.visitor;

import com.newcore.design.patterns.visitor.service.ComputerPart;
import com.newcore.design.patterns.visitor.service.ComputerPartVisitor;
import com.newcore.design.patterns.visitor.service.part.Computer;
import com.newcore.design.patterns.visitor.service.visitor.ComputerPartDisplayVisitor;
import org.junit.jupiter.api.Test;

/**
 * 访问者模式测试类
 * @author zhouchaowei
 */
public class VisitorPatternTest {

    /**
     * 测试方法
     */
    @Test
    public void test(){
        /* 1.计算机 */
        ComputerPart computer = new Computer();
        /* 2.计算机访问者 */
        ComputerPartVisitor computerVisitor = new ComputerPartDisplayVisitor();
        /* 3.访问计算机 */
        computer.accept(computerVisitor);
    }
}
