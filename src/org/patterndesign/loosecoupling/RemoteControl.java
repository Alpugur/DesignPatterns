package org.patterndesign.loosecoupling;

public class RemoteControl {

	private RemoteControlInterface remote;

	public RemoteControl(RemoteControlInterface _remote) {

		this.remote = _remote;
	}

	public void on() {
		remote.on();
	}

	public void off() {
		remote.off();
	}

	// OCP prensibine ters bir durum örneği. Aşağıdaki bir yapı kabul edilemez
	// çünkü OCP'ye göre mevcut kod değiştirilmemelidir. Oysa ki yeni bir alet
	// eklemek istediğimizde alttaki iki metodu da değiştirmemiz gerekecektir.

	public void on_not_OCP(Object obj) {
		if (obj instanceof TV) {
			((TV) obj).on();
		} else if (obj instanceof Radio) {
			((Radio) obj).on();
		}
	}

	public void off_not_OCP(Object obj) {
		if (obj instanceof TV) {
			((TV) obj).off();
		} else if (obj instanceof Radio) {
			((Radio) obj).off();
		}
	}
}
