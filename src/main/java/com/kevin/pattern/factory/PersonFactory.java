package com.kevin.pattern.factory;

/**
 * Created by Kevin on 2016/8/11.
 */
public class PersonFactory {

    public static Person getGetInstance(String className) throws Exception {
        return (Person)Class.forName(className).newInstance();
    }

}
