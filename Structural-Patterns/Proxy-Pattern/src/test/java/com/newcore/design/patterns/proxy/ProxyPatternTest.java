package com.newcore.design.patterns.proxy;

import com.newcore.design.patterns.proxy.service.Image;
import com.newcore.design.patterns.proxy.service.ProxyImage;
import org.junit.jupiter.api.Test;

/**
 * 代理模式测试类
 * @author zhouchaowei
 */
public class ProxyPatternTest {

    /**
     * 测试方法
     */
    @Test
    public void test(){
        Image image = new ProxyImage("test_10mb.jpg");

        /* 图像将从磁盘加载 */
        image.display();
        System.out.println("");
        /* 图像不需要从磁盘加载 */
//        image.display();
    }
}
