package com.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreak_01 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton_01 singleton = Singleton_01.getInstance();

        Constructor<Singleton_01> declaredConstructor = Singleton_01.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton_01 singleton_01 = declaredConstructor.newInstance();

        System.out.println(singleton == singleton_01);
    }
}
