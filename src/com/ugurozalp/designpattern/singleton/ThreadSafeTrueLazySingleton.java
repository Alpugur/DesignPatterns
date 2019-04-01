package com.ugurozalp.designpattern.singleton;

public class ThreadSafeTrueLazySingleton {

	private static volatile ThreadSafeTrueLazySingleton INSTANCE;

	private static int count;
	private String name;

	private ThreadSafeTrueLazySingleton() {
		name = "ThreadSafeTrueLazySingleton" + count;
		count++;
	}

	public static ThreadSafeTrueLazySingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (ThreadSafeTrueLazySingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new ThreadSafeTrueLazySingleton();
				}
			}
		}
		return INSTANCE;
	}

	public void printName() {
		System.out.println(name);
	}

}
