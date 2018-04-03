package singletonpattern.improved;

public final class Client {

	public static void main(String[] args) {

		Preferences.getInstance().helloSingleton();
		MyPreferences.getInstance().helloSingleton();		

	}

}
