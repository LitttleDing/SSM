package com.db.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args){
        Set<Map<String,String>>  test = new HashSet<>();

        Map<String,String> map = new HashMap<>();

        test.add(map);
        System.out.println(test.contains(map));


        map.put("test","test");
        System.out.println(test.contains(map));


    }
}

