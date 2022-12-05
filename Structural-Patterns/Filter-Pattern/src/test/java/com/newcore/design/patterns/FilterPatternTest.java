package com.newcore.design.patterns;

import com.newcore.design.patterns.filter.service.Person;
import com.newcore.design.patterns.filter.service.criteria.Criteria;
import com.newcore.design.patterns.filter.service.criteria.impl.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 * @author zhouchaowei
 */
public class FilterPatternTest {

    @Test
    public void test(){
        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Robert","Male", "Single"));
        personList.add(new Person("John","Male", "Married"));
        personList.add(new Person("Laura","Female", "Married"));
        personList.add(new Person("Diana","Female", "Single"));
        personList.add(new Person("Mike","Male", "Single"));
        personList.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(personList));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(personList));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(personList));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(personList));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
