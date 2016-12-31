package org.patterndesign.loosecoupling;

public class TV implements RemoteControlInterface {

	@Override
	public void on() {
		System.out.println("TV opened.");
	}

	@Override
	public void off() {
		System.out.println("TV closed.");
	}

}
