package com.pattern.singleton;

public class Singleton_01 {

    private static Singleton_01 instance;

    private Singleton_01() {}

    public static Singleton_01 getInstance() {
        if (instance == null) {
            instance = new Singleton_01();
        }

        return instance;
    }
}
