package main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// Constructs the frame of the application.

public class ApplicationWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	// Input/Output boxes
	private JTextField inputBox;
	private JTextField outputBox;
	
	// Instruction labels and enter button
	private JLabel enterValueLbl;
	private JLabel yourResultLbl;
	private JLabel enter;
	
	// Default values
	private static final int DEFAULT_FRAME_WIDTH = 450;
	private static final int DEFAULT_FRAME_HEIGHT = 300;
	
	// TaskBar icon
	private Image tbIcon;
	
	public ApplicationWindow() {
		initialize();
	}
	
	private void initialize() {
		
		// Frame
		this.getContentPane().setBackground(SystemColor.info);
		this.setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		// Labels
		enterValueLbl = new JLabel("Enter a value!");
		enterValueLbl.setFont(new Font("Cooper Black", Font.BOLD, 24));
		enterValueLbl.setBounds(12, 0, 192, 38);
		this.getContentPane().add(enterValueLbl);
		
		yourResultLbl = new JLabel("Your result:");
		yourResultLbl.setFont(new Font("Cooper Black", Font.BOLD, 24));
		yourResultLbl.setBounds(238, 0, 170, 38);
		this.getContentPane().add(yourResultLbl);
		
		enter = new JLabel("");
		enter.setToolTipText("Click this or press enter.");
		enter.setIcon(new ImageIcon(ApplicationWindow.class.getResource("/resources/enterbutton.png")));
		enter.setBounds(87, 104, 48, 48);
		this.getContentPane().add(enter);
		
		// Textfields
		inputBox = new JTextField();
		inputBox.setFont(new Font("Cooper Black", Font.PLAIN, 16));
		inputBox.setToolTipText("Your input must be a positive integer");
		inputBox.setHorizontalAlignment(SwingConstants.CENTER);
		inputBox.setBounds(0, 37, 214, 54);
		inputBox.setColumns(10);
		this.getContentPane().add(inputBox);
		
		outputBox = new JTextField();
		outputBox.setFont(new Font("Cooper Black", Font.PLAIN, 16));
		outputBox.setBackground(Color.WHITE);
		outputBox.setHorizontalAlignment(SwingConstants.CENTER);
		outputBox.setEditable(false);
		outputBox.setBounds(214, 37, 220, 54);
		outputBox.setColumns(10);
		this.getContentPane().add(outputBox);
		
		// TaskBar Icon
		try {
			this.tbIcon = ImageIO.read(getClass().getResource("/resources/taskBarIcon.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setIconImage(tbIcon);
		
	}
	
	// GETTERS
	public JTextField getInputBox() {
		return inputBox;
	}
	
	public JTextField getOutputBox() {
		return outputBox;
	}
	
	public JLabel getEnterButton() {
		return enter;
	}

}
