package com.weigs.FilterPattern;

import java.util.List;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
