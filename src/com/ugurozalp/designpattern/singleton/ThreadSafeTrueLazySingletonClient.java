package com.ugurozalp.designpattern.singleton;

public class ThreadSafeTrueLazySingletonClient extends Thread {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10000; i++) {
			new ThreadSafeTrueLazySingletonClient().start();
		}
	}

	public void run() {
		ThreadSafeTrueLazySingleton ls = ThreadSafeTrueLazySingleton
				.getInstance();
		ls.printName();
	}

}
