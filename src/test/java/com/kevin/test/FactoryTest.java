package com.kevin.test;

import com.kevin.pattern.factory.Person;
import com.kevin.pattern.factory.PersonFactory;
import org.junit.Test;

/**
 * Created by Kevin on 2016/9/2.
 */
public class FactoryTest {

    @Test
    public void testFactory() {
        String className1 = "com.kevin.pattern.factory.Chinese";
        String className2 = "com.kevin.pattern.factory.American";
        try {
            Person person1 = PersonFactory.getGetInstance(className1);
            Person person2 = PersonFactory.getGetInstance(className2);
            person1.speak();
            person2.speak();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
