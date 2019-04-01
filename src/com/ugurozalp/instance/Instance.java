package com.ugurozalp.instance;

public class Instance {

	public static void main(String[] args) {

		Object o1 = new Object();
		Object o2 = 2;
		Object o3 = 2;

		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		if (o1 == o2) {
			System.out.println("o1 == o2");
		}
		if (o2 == o3) {
			System.out.println("o2 == o3");
		}
		if (o1.equals(o2)) {
			System.out.println("o1.equals(o2)");
		}
		if (o2.equals(o3)) {
			System.out.println("o2.equals(o3)");
		}
		
		
		Integer i1 = new Integer(2);
		Integer i2 = 2;
		Integer i3 = 2;
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());
		if (i1 == i2) {
			System.out.println("i1 == i2");
		}
		if (i2 == i3) {
			System.out.println("i2 == i3");
		}

		String v1 = new String("Selam");
		String v2 = "Selam";
		String v3 = "Selam";
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(v3.hashCode());
		if (v1 == v2) {
			System.out.println("v1 == v2");
		}
		if (v2 == v3) {
			System.out.println("v2 == v3");
		}
		if (v1.equals(v2)) {
			System.out.println("v1.equals(v2)");
		}
		if (v2.equals(v3)) {
			System.out.println("v2.equals(v3)");
		}

	}

}
