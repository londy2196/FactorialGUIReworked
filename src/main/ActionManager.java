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
				factorial = Calculator.validateInput(application.getInputBox().getText());
				application.getOutputBox().setText(factorial);
			}
		});
		
		// for inputBox
		application.getInputBox().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				factorial = Calculator.validateInput(application.getInputBox().getText());
				application.getOutputBox().setText(factorial);
			}
		});

	}
}
