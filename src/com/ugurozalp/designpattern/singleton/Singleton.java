package com.ugurozalp.designpattern.singleton;

public class Singleton {

	private static Singleton INSTANCE = new Singleton();

	private static int count;
	private String name;

	private Singleton() {
		name = "Singleton" + count;
		count++;
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

	public void printName() {
		System.out.println(name);
	}

	public final Object clone() {
		return this;
	}

}
