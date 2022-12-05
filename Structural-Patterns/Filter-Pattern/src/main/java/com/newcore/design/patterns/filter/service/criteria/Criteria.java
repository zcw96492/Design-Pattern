package com.newcore.design.patterns.filter.service.criteria;

import com.newcore.design.patterns.filter.service.Person;

import java.util.List;

/**
 * 标准接口
 * @author zhouchaowei
 */
public interface Criteria {

    /**
     * 约会标准
     * @param persons 人员
     * @return 人员列表
     */
    List<Person> meetCriteria(List<Person> persons);
}
