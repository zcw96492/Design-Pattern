package com.newcore.design.patterns.template;

import com.newcore.design.patterns.template.service.Cricket;
import com.newcore.design.patterns.template.service.Football;
import com.newcore.design.patterns.template.service.Game;
import org.junit.jupiter.api.Test;

/**
 * 模版方法测试类
 * @author zhouchaowei
 */
public class TemplatePatternTest {

    /**
     * 测试方法
     */
    @Test
    public void test(){
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }
}
