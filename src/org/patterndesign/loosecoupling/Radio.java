package org.patterndesign.loosecoupling;

public class Radio implements RemoteControlInterface {

	@Override
	public void on() {
		System.out.println("Radio opened.");
	}

	@Override
	public void off() {
		System.out.println("Radio closed.");
	}

}
