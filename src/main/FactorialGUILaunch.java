package main;
public class FactorialGUILaunch {
	
	@SuppressWarnings("unused")
	
	public static void main(String[] args) {
		
		ApplicationWindow application = new ApplicationWindow();
		ActionManager actionManager = new ActionManager(application);
		application.setVisible(true);
		
	}

}
