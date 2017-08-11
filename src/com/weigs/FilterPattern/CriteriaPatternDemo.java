package com.weigs.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPerson(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPerson(female.meetCriteria(persons));

        System.out.println("\nSingle");
        printPerson(single.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPerson(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPerson(singleOrFemale.meetCriteria(persons));
    }

    private static void printPerson(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }

}
