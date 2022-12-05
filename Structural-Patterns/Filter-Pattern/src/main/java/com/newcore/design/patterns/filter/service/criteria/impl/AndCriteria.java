package com.newcore.design.patterns.filter.service.criteria.impl;

import com.newcore.design.patterns.filter.service.Person;
import com.newcore.design.patterns.filter.service.criteria.Criteria;

import java.util.List;

/**
 * 标准
 * @author zhouchaowei
 */
public class AndCriteria implements Criteria {

    private final Criteria criteria;
    private final Criteria otherCriteria;

    /**
     * 构造器
     * @param criteria 标准
     * @param otherCriteria 其它标准
     */
    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * 约会标准
     * @param persons 人员
     * @return 人员列表
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
