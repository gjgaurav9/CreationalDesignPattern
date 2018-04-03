package abstractfactorypattern.improved;

public class Client {
	

	public static void initializeGUI(WidgetFactory factory) {
		initializeGUI(factory.createScrollBar(), factory.createWindow());
	}
	
	public static void initializeGUI(ScrollBar bar , Window window) {
		
		System.out.println("Do initialization logic here with "+window.getClass().getName() +" and "+ bar.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		WidgetFactory factory = new PInkThemeWidgetfactory();
		
		initializeGUI(factory);
		
		factory = new YellowThemeWidgetFactory();
		
		initializeGUI(factory);
		
	}

}
