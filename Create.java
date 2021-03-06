package com.faikturan;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

		// construct preCompenents
		String[] originCBoxItems = { "Ireland", "United Kingdom", "France", "Germany", "Spain", "Greece", "Poland",
				"Holland", "Sweden", "Norway", "Portugal", "Italy", "Belarus", "Turkey" };
		String[] destinationCBoxItems = { "Ireland", "United Kingdom", "France", "Germany", "Spain", "Greece", "Poland",
				"Holland", "Sweden", "Norway", "Portugal", "Italy", "Belarus", "Turkey" };

		// construct compenents
		flightIdLbl = new JLabel("Flight ID: ");
		deptTimeLbl = new JLabel("Departure Time: ");
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

		// adjust size and set layout
		setSize(690, 215);
		setLayout(null);

		// add compenents
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

		// set compenent bound (only needed by Absolute Positioning)
		flightIdLbl.setBounds(50, 15, 100, 25);
		deptTimeLbl.setBounds(50, 40, 100, 25);
		arrivalTimeLbl.setBounds(50, 65, 100, 25);
		originLbl.setBounds(50, 90, 100, 25);
		destinationLbl.setBounds(50, 115, 100, 25);
		custIdLbl.setBounds(300, 15, 100, 25);
		fnameLbl.setBounds(300, 40, 100, 25);
		snameLbl.setBounds(300, 60, 100, 25);
		contactNoLbl.setBounds(300, 90, 100, 25);
		bookingType.setBounds(300, 125, 100, 25);
		flightIdTf.setBounds(150, 15, 125, 25);
		depTimeTf.setBounds(150, 40, 125, 25);
		arrTimeTf.setBounds(150, 65, 125, 25);
		custIdTf.setBounds(390, 15, 125, 25);
		fnameTf.setBounds(390, 40, 125, 25);
		surnameTf.setBounds(390, 65, 125, 25);
		contactNoTf.setBounds(390, 90, 125, 25);
		createBtn.setBounds(540, 40, 100, 25);
		cancelBtn.setBounds(540, 70, 100, 25);
		originCbox.setBounds(150, 90, 125, 25);
		destinationCbox.setBounds(150, 115, 125, 25);
		econRadioBtn.setBounds(410, 115, 80, 25);
		busRadioBtn.setBounds(410, 140, 100, 25);

		// add ActionListener to buttons
		createBtn.addActionListener(this);
		cancelBtn.addActionListener(this);

		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);// center Frame on screen
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object target = event.getSource();

		if (target == createBtn) {
			try {
				String flightId = flightIdTf.getText();
				String deptTime = depTimeTf.getText();
				String arrTime = arrTimeTf.getText();
				String customer = custIdTf.getText();
				String fname = fnameTf.getText();
				String sname = surnameTf.getText();
				String contactNo = contactNoTf.getText();

				// cast comboBox selection to a String object
				String origin = (String) originCbox.getSelectedItem();
				String destination = (String) destinationCbox.getSelectedItem();
				// get radioGroup selected item
				String bookingType;
				if (econRadioBtn.isSelected()) {
					bookingType = "Economy";
				} else if (busRadioBtn.isSelected()) {
					bookingType = "Business";
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Booking Type");
					return;// stop current method
				}

				System.out.println("Merhaba Mustafa Hocam");
				// create insert statement and create the new record
				String newBooking = "INSERT INTO booking_info (Flight_Id,Departure_Time, Arrival_Time, Origin, Destination, Customer_Id,Customer_Fname, Customer_Sname,Customer_Photo, Customer_ContactNo, Booking_Type) VALUES ('"+ flightId +"', '"+ deptTime +"', '"+ arrTime +" ', '"+ origin  +"', '"+ destination +"','"+ customer +" ', '"+  fname +" ','"+ sname +"','resim', '"+ contactNo +"', '"+ bookingType +"')";
				ConnectionHelper.st.executeUpdate(newBooking);//execute SQL statement
				
				JOptionPane.showMessageDialog(null, "Record Successfully Added to Database");
				MainMenu.count++;
				MainMenu.initialise();
				this.setVisible(true);
			} catch (Exception ex) {
				System.out.println("Exception: " +ex);
			}
		} 
		if (target == cancelBtn) {
			this.dispose();
		}

		}
	
	public static void main(String[] args) {
		Create myCreate = new Create();

	}

	}
