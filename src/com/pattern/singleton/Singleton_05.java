package com.pattern.singleton;

import java.io.Serializable;

public class Singleton_05 implements Serializable {

    private Singleton_05() {}

    private static class Singleton_05Holder {
        private static final Singleton_05 SINGLETON_05 = new Singleton_05();
    }

    public static Singleton_05 getInstance() {
        return Singleton_05Holder.SINGLETON_05;
    }
}
