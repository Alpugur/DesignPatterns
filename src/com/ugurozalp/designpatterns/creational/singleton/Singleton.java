package com.ugurozalp.designpatterns.creational.singleton;

public class Singleton {

    private static volatile Singleton INSTANCE;

    private static int count;
    private String name;

    private Singleton() {
        name = "ThreadSafeTrueLazySingleton_" + count;
        count++;
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    public void printName() {
        System.out.println(name);
    }

}
