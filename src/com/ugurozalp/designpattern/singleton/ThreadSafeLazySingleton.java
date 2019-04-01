package com.ugurozalp.designpattern.singleton;

public class ThreadSafeLazySingleton {

	private static ThreadSafeLazySingleton INSTANCE;

	private ThreadSafeLazySingleton() {
	}

	public static ThreadSafeLazySingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (ThreadSafeLazySingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new ThreadSafeLazySingleton();
				}
			}
		}
		return INSTANCE;
	}

}
