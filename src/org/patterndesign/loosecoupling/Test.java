package org.patterndesign.loosecoupling;

public class Test {

	public static void main(String[] args) {
		RemoteControlInterface rci = new Radio();
		RemoteControl control = new RemoteControl(rci);

		control.on();
		control.off();

	}

}
