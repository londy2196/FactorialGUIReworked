package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActionManager {
	
	private ApplicationWindow application;	
	private String factorial;
	
	public ActionManager(ApplicationWindow app) {
		
		this.application = app;
		
		//for enterButton
		application.getEnterButton().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				factorial = validateInput(application.getInputBox().getText());
				application.getOutputBox().setText(factorial);
			}
		});
		
		// for inputBox
		application.getInputBox().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				factorial = validateInput(application.getInputBox().getText());
				application.getOutputBox().setText(factorial);
			}
		});
	
	}
	
	private String factorial(String input) {
		int n = Integer.parseInt(input);
		long fact = 1;
		if (n == 0 || n == 1) {
			return Long.toString(fact);
		}
		else {
			for (int i = n; i > 0; i--) {
				fact = fact * i;
			}
			return Long.toString(fact);
		}
	}
	
	private String validateInput(String input) {
		if (input.equals("") || !input.matches("\\d+")) {
			return "Invalid form";
		}
		else {
			return factorial(input);
		}
	}
	
	

}
