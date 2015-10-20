package org.patterndesign.factory;

public class Test {

	public static void main(String[] args) {

		ArabaFabrika bmw = new Bmw();

		ArabaFabrika audi = new Audi();

		for (Araba araba : bmw.getArabaListesi()) {
			System.out.println(araba.getMarka() + " " + araba.getModel() + ", "
					+ araba.getBeygirGucu());
		}

		for (Araba araba : audi.getArabaListesi()) {
			System.out.println(araba.getMarka() + " " + araba.getModel() + ", "
					+ araba.getBeygirGucu());
		}
	}

}
