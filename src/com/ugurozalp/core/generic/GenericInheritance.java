package com.ugurozalp.core.generic;

public class GenericInheritance {

	public static void main(String[] args) {
		new Sub<Integer>(1);
		new Super<String>("Hi").show();
		Sub<Double> o1 = new Sub<Double>(2D);
		Super<?> o = o1;
		o.show();

		Super<Integer> i1 = new Sub<Integer>(1);
		i1.show();
		
		Super<Integer> i2 = new Super<Integer>(2);
		i2.show();
		
	}

}

class Super<T> {
	T ob;
	public Super(T ob) {
		this.ob = ob;
	}
	public void show() {
		System.out.println(ob);
	}
}

class Sub<T> extends Super<T> {
	public Sub(T ob) {
		super(ob);
	}
}