package org.patterndesign.factory;

public class Bmw extends ArabaFabrika{

	@Override
	public void createAuto() {

		getArabaListesi().add(new Z4(170));
	}

}
