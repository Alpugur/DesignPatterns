package com.ugurozalp.designpatterns.creational.singleton;

public class SingletonWithoutLazyLoad {

	private static SingletonWithoutLazyLoad INSTANCE = new SingletonWithoutLazyLoad();

	private static int count;
	private String name;

	private SingletonWithoutLazyLoad() {
		name = "Singleton_" + count;
		count++;
	}

	public static SingletonWithoutLazyLoad getInstance() {
		return INSTANCE;
	}

	public void printName() {
		System.out.println(name);
	}

	public final Object clone() {
		return this;
	}

}
