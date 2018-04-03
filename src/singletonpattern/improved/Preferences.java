package singletonpattern.improved;

public class Preferences {
	
	private static Preferences instance = null;
	
	//private String preference;
	
	//This constructor can only be used this class or its child.ss
	protected Preferences() {

	}
	
	//a thread-safe code to create the instance.
	private synchronized static void createInstance() {
		if(instance == null) {
			instance = new Preferences();			
		}
	}
	
	//giving the instance after checking that it is null or not.
	public static Preferences getInstance() {
		if(instance == null) {
			createInstance();
		}
		return instance;
	}
	
	public void helloSingleton() {
		System.out.println("Hello! Singleton");
	}

}
