package com.pattern.singleton;

import java.io.*;

public class SingletonBreak_02 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton_05 singleton = Singleton_05.getInstance();
        Singleton_05 singleton1 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.obj"))) {
            out.writeObject(singleton);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.obj"))) {
            singleton1 = (Singleton_05) in.readObject();
        }

        System.out.println(singleton == singleton1);
    }
}
