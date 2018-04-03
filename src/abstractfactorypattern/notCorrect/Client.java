package abstractfactorypattern.notCorrect;

public class Client {
	
	public static void initializeGUI(ScrollBar bar , Window window) {
		
		System.out.println("Do initialization logic here with "+window.getClass().getName() +" and "+ bar.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		ScrollBar bar = new PinkThemeScrollBar();
		Window window = new PinkThemeWindow();
		
		initializeGUI(bar, window);
		
	}

}
