package com.kevin.test;

import com.kevin.pattern.singleton.LazySingleton;
import com.kevin.pattern.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kevin on 2016/9/2.
 */
public class SingletonTest {

    @Test
    public void testSingleton(){

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Assert.assertTrue(instance1 == instance2);
        System.out.println(instance1 == instance2);

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        Assert.assertTrue(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1 == lazySingleton2);
    }
}
