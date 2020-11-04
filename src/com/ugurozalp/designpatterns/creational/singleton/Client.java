package com.ugurozalp.designpatterns.creational.singleton;

public class Client extends Thread {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Client().start();
        }
    }

    public void run() {

        Singleton singleton = Singleton.getInstance();
        singleton.printName();

        SingletonWithoutLazyLoad  ls = SingletonWithoutLazyLoad .getInstance();
        ls.printName();
    }

}
