package com.kevin.pattern.singleton;

/**
 * Created by Kevin on 2016/9/1.
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }


}
