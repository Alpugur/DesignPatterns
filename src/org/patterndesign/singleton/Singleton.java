package org.patterndesign.singleton;

/**
 * Implement the Singleton design pattern
 * 
 * @author ugur.ozalp
 *
 */
public class Singleton {

	// Singleton sınıfından olusturulabilecek tek nesne statik olarak
	// tanıtılıyor.
	private static volatile Singleton instance = null;

	// Double check locking için kullanılan nesne
	private static Object lock = new Object();

	// Baska sınıfların Singleton sınıfından nesne oluşturmalarını engellemek
	// için constructor'u private olarak tanımlarız.
	private Singleton() {
		System.out.println("singletion init()");
	}

	// Singleton sınıfından olusturulabilen tek nesneye ulasmak için instance()
	// metodu olusturuyoruz.
	public static Singleton instance() {
		if (instance == null) {
			// Double checked locking
			synchronized (lock) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void printThis() {
		System.out.println(this);
	}

}
