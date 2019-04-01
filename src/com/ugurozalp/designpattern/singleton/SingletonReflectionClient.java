package com.ugurozalp.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionClient {

	public static void main(String[] args) {
		Class<Singleton> singletonClass = Singleton.class;
		Constructor<Singleton> defaultConstructor = null;
		try {
			defaultConstructor = singletonClass.getDeclaredConstructor(null);
		} catch (NoSuchMethodException e) {
			System.out.println("Problem with calling method: " + e.getMessage());
			e.printStackTrace();
		} catch (SecurityException e) {
			System.out.println("Problem with security: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Name: " + defaultConstructor.getName());
		System.out.println("Modifier: " + defaultConstructor.getModifiers());
		System.out.println("Is accessible: " + defaultConstructor.isAccessible());
		defaultConstructor.setAccessible(true);
		System.out.println("Modifier: " + defaultConstructor.getModifiers());
		System.out.println("Is accessible: " + defaultConstructor.isAccessible());
		
		Singleton secondSingleton = null;
		
		try {
			secondSingleton  =defaultConstructor.newInstance(null);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		secondSingleton.printName();
		
	}

}
