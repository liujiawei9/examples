package com.kevin.pattern.singleton;

/**
 * Create the instance when the variable is initialized
 * Created by Kevin on 2016/9/1.
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }


}
