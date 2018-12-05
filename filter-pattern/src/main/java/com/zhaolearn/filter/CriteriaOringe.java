package com.zhaolearn.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 橘子标准
 */
public class CriteriaOringe implements Criteria {
    @Override
    public List<Fruit> fruitCriteria(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getName().equals("ORINGE")) {
                result.add(fruits.get(i));
            }
        }
        return result;
    }
}
