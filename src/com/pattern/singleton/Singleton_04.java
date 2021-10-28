package com.pattern.singleton;

public class Singleton_04 {

    private static volatile Singleton_04 instance;

    private Singleton_04() {
    }

    public static Singleton_04 getInstance() {
        if (instance == null) {
            synchronized (Singleton_04.class) {
                if (instance == null) {
                    return new Singleton_04();
                }
            }
        }
        return instance;
    }
}
