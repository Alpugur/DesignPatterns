package com.ugurozalp.core.generic;

public class Multiplication {

	static <T extends Number> double multiply(T value, T factor) {
		return value.longValue() * factor.longValue();
	}
}
