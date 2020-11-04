package com.ugurozalp.designpatterns.creational.builder;

public class Serum {

	private final int water; // (ml) required
	private final int sodiumIon; // required
	private final int magnesium; // optional
	private final int creatine; // (g) optional
	private final int globulin; // (mg) optional
	private final int carbohydrate; // (g) optional

	private Serum(Builder builder) {
		water = builder.water;
		sodiumIon = builder.sodiumIon;
		magnesium = builder.magnesium;
		creatine = builder.creatine;
		globulin = builder.globulin;
		carbohydrate = builder.carbohydrate;
		System.out.println("Serum is created");

	}
	public String toString(String objectName) {
		return "Serum:" + objectName + " (water=" + water + " ,sodiumIon="
				+ sodiumIon + " ,magnesium=" + magnesium + " ,creatine="
				+ creatine + " ,globulin=" + globulin + " ,carbohydrate="
				+ carbohydrate

				+ ")";
	}

	public static class Builder {
		// Required parameters
		private final int water;
		private final int sodiumIon;

		// Optional parameters - initialized to default values
		private int magnesium = 0; // optional
		private int creatine = 0; // (g) optional
		private int globulin = 0; // (mg) optional
		private int carbohydrate = 0; // (g) optional

		public Builder(int water, int sodium) {
			this.water = water;
			this.sodiumIon = sodium;
		}

		public Builder magnesium(int val) {
			magnesium = val;
			return this;
		}
		public Builder creatine(int val) {
			creatine = val;
			return this;
		}
		public Builder globulin(int val) {
			globulin = val;
			return this;
		}
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Serum build() {
			return new Serum(this);
		}
	}

	public static void main(String[] args) {
		Serum typeB = new Builder(240, 8).magnesium(100).creatine(35)
				.carbohydrate(75).build();
		System.out.println(typeB.toString("typeB"));

	}
}
