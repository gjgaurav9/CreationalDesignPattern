package singleton.trial;


public final class Client {

	public static void main(String[] args) {

		System.out.println(Preferences.globalPreferences.getPreferenceDetaills());
		
		Preferences secondPreferences = new Preferences("Second Preferences");
		
		Preferences.globalPreferences = secondPreferences;
		
		System.out.println(Preferences.globalPreferences.getPreferenceDetaills());
		
		

	}

}
