package com.faikturan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Create extends JFrame implements ActionListener {

	private JLabel flightIdLbl;
	private JLabel arrivalTimeLbl;
	private JLabel deptTimeLbl;
	private JLabel originLbl;
	private JLabel destinationLbl;
	private JLabel custIdLbl;
	private JLabel fnameLbl;
	private JLabel snameLbl;
	private JLabel contactNoLbl;
	private JLabel bookingType;
	private JTextField flightIdTf;
	private JTextField depTimeTf;
	private JTextField arrTimeTf;
	private JTextField custIdTf;
	private JTextField fnameTf;
	private JTextField surnameTf;
	private JTextField contactNoTf;
	private JButton createBtn;
	private JButton cancelBtn;
	private JComboBox originCbox;
	private JComboBox destinationCbox;
	private JRadioButton econRadioBtn;
	private JRadioButton busRadioBtn;
	private ButtonGroup bg;
	
	public Create() {
		super("Create Booking");
		
		//construct preCompenents
		String[] originCBoxItems = {"Ireland", "United Kingdom", "France", "Germany", "Spain",
				"Greece", "Poland", "Holland", "Sweden", "Norway", "Portugal", "Italy", "Belarus", "Turkey"};
		String[] destinationCBoxItems = {"Ireland", "United Kingdom", "France", "Germany", "Spain",
				"Greece", "Poland", "Holland", "Sweden", "Norway", "Portugal", "Italy", "Belarus", "Turkey"};
		
		//construct compenents
		flightIdLbl = new JLabel("Flight ID: ");
		deptTimeLbl = new JLabel("Deoarture Time: ");
		arrivalTimeLbl = new JLabel("Arrival Time: ");
		originLbl = new JLabel("Origin:");
		destinationLbl = new JLabel("Destination:");
		custIdLbl = new JLabel("Customer ID:");
		fnameLbl = new JLabel("First Name:");
		snameLbl = new JLabel("Surname:");
		contactNoLbl = new JLabel("Contact No:");
		bookingType = new JLabel("Booking Type:");
		flightIdTf = new JTextField(5);
		depTimeTf = new JTextField(5);
		arrTimeTf = new JTextField(5);
		custIdTf = new JTextField(5);
		fnameTf = new JTextField(5);
		surnameTf = new JTextField(5);
		contactNoTf = new JTextField(5);
		createBtn = new JButton("Create");
		cancelBtn = new JButton("Cancel");
		originCbox = new JComboBox(originCBoxItems);
		destinationCbox = new JComboBox(destinationCBoxItems);
		econRadioBtn = new JRadioButton("Economy");
		busRadioBtn = new JRadioButton("Business");
		bg = new ButtonGroup();
		bg.add(econRadioBtn);
		bg.add(busRadioBtn);
		
		//adjust size and set layout
		setSize(690, 215);
		setLayout(null);
		
		//add compenents
		add(flightIdLbl);
		add(deptTimeLbl);
		add(arrivalTimeLbl);
		add(originLbl);
		add(destinationLbl);
		add(custIdLbl);
		add(fnameLbl);
		add(snameLbl);
		add(contactNoLbl);
		add(bookingType);
		add(flightIdTf);
		add(depTimeTf);
		add(arrTimeTf);
		add(custIdTf);
		add(fnameTf);
		add(surnameTf);
		add(contactNoTf);
		add(createBtn);
		add(cancelBtn);
		add(originCbox);
		add(destinationCbox);
		add(econRadioBtn);
		add(busRadioBtn);
		
		
		
		
		
		}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}

}
