package com.ugurozalp.designpattern.builder;
public class TestBuilderPattern {

	public static void main(String[] args) {
		// Using builder to get the object in a single line of code and
		// without any inconsistent state or arguments management issues
		Computer comp = new Computer
				.ComputerBuilder("500 GB", "2 GB")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.build();
		System.out.println(comp.toString());

		ComputerWithLombok comp2 = new ComputerWithLombok().builder()
				.HDD("1 TB")
				.RAM("16 GB")
				.isBluetoothEnabled(true)
				.build();
		System.out.println(comp2.toString());

		ComputerWithLombok comp3 = new ComputerWithLombok.ComputerWithLombokBuilder()
				.HDD("2 TB")
				.RAM("32 GB")
				.isBluetoothEnabled(true)
				.isGraphicsCardEnabled(true)
				.build();
		System.out.println(comp3.toString());

	}

}