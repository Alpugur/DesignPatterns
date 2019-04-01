package com.ugurozalp.designpattern.singleton;

public class LazySingleton {

	public static LazySingleton INSTANCE = new LazySingleton();

	private LazySingleton() {
	}

	public void printLoad() {
		System.out.println(INSTANCE);
	}

	public static void main(String[] args) {
		LazySingleton sg = LazySingleton.INSTANCE;
		sg.printLoad();
	}

}
