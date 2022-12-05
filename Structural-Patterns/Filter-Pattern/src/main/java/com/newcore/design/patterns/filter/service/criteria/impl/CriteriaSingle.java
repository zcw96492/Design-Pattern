package com.newcore.design.patterns.filter.service.criteria.impl;

import com.newcore.design.patterns.filter.service.Person;
import com.newcore.design.patterns.filter.service.criteria.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 单身标准
 * @author zhouchaowei
 */
public class CriteriaSingle implements Criteria {

    private static final Logger logger = LoggerFactory.getLogger(CriteriaSingle.class);

    /**
     * 约会标准
     * @param persons 人员
     * @return 人员列表
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
