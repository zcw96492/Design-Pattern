package com.newcore.design.patterns.filter.service.criteria.impl;

import com.newcore.design.patterns.filter.service.Person;
import com.newcore.design.patterns.filter.service.criteria.Criteria;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    /**
     * 构造器
     * @param criteria 标准
     * @param otherCriteria 其它标准
     */
    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
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
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
