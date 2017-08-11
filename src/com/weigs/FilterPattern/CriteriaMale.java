package com.weigs.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
