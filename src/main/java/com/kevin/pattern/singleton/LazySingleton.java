package com.kevin.pattern.singleton;

/**
 * Use static inner class to implement singleton's lazy initialization.
 * It is thread safety.
 * Created by Kevin on 2016/9/1.
 */
public class LazySingleton {

    private static class SingletonHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    private LazySingleton(){
        System.out.println("LazySingleton Instance Created.");
    }

    public static final LazySingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
