package com.ugurozalp.designpatterns.creational.prototype;

public class Client {
    public static void main(String[] args) {
        TeaCup slenderTeaCup = new TeaCup(1, 500, "glass", "tea plate");
        System.out.println(slenderTeaCup);

        TeaCup cup = (TeaCup) slenderTeaCup.clone();
        cup.setId(2);
        cup.setAccessory("handle");
        System.out.println(cup);
    }
}
