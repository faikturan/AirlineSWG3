package com.faikturan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements Database_Interface, ActionListener {

	private JLabel logoLbl;
	private JLabel userNameLbl;
	private JLabel passwordLbl;
	private JTextField usernameTf;
	private JPasswordField passwordTf;
	private JButton loginBtn;
	public static String user = "";
	private String password = "";
	
	public Login() {
		super("Login Screen");
		
		//Initialize connection
		ConnectionHelper.DBConnect();
		
		//construct compenets
		userNameLbl = new JLabel("Username: ");
		passwordLbl = new JLabel("Password: ");
		usernameTf = new JTextField(5);
		passwordTf = new JPasswordField(5);
		loginBtn = new JButton("Login");
		
		//Add logo image to label
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialise() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		JFrame myLogin = new Login();

	}

}
