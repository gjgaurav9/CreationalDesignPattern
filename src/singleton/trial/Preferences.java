package singleton.trial;


public class Preferences {
	
	public static Preferences globalPreferences = new Preferences("First one created");
	
	private String preference;
	
	public Preferences(String preference) {
		this.preference = preference;
	}
	
	public String getPreferenceDetaills() {
		return preference;
	}

}
