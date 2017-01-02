package com.faikturan;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;

import com.faikturan.Booking.Booking_Type;

public class MainMenu extends JFrame implements ActionListener {
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
	private JTextField originTf;
	private JTextField destTf;
	private JTextField custIdTf;
	private JTextField fnameTf;
	private JTextField surnameTf;
	private JTextField contactNoTf;
	private JTextField bookingTypeTf;
	private JButton prevBtn;
	private JButton nextBtn;
	private JButton createBtn;
	private JButton updateBtn;
	private JButton deleteBtn;
	private JButton closeBtn;
	private JButton backupBtn;
	private JButton reportBtn;
	private static JLabel imageLabel;
	private JLabel clockLbl;
	private JLabel dateLbl;
	private JLabel userLbl;
	private JLabel loggedDescLbl;
	private JLabel timeDescLbl;
	private JLabel dateDescLbl;
	private JLabel logoLbl;

	// create a Booking object
	public static Booking myBooking = new Booking();

	// record navigation variables
	public static int count = 0;
	public static int current = 0;

	public MainMenu() {
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
		prevBtn = new JButton("Previous");
		nextBtn = new JButton("Next");
		createBtn = new JButton("Create");
		updateBtn = new JButton("Update");
		deleteBtn = new JButton("Delete");
		closeBtn = new JButton("Close");
		imageLabel = new JLabel("");
		backupBtn = new JButton("Backup Record");
		reportBtn = new JButton("View Report");
		clockLbl = new JLabel();
		dateLbl = new JLabel();
		userLbl = new JLabel(Login.user);
		loggedDescLbl = new JLabel("User : ");
		timeDescLbl = new JLabel("Time : ");
		dateDescLbl = new JLabel("Date : ");

		// Add logo image to label
		ImageIcon image = new ImageIcon("resources/airline.jpg");
		logoLbl = new JLabel("", image, JLabel.CENTER);

		// adjust size and layout
		setSize(840, 335);
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
		add(updateBtn);
		add(deleteBtn);
		add(closeBtn);
		add(imageLabel);
		add(backupBtn);
		add(reportBtn);
		add(clockLbl);
		add(dateLbl);
		add(userLbl);
		add(loggedDescLbl);
		add(timeDescLbl);
		add(dateDescLbl);
		add(logoLbl);

		// add border to customerImage Label
		Border border = BorderFactory.createLineBorder(Color.gray, 1);
		imageLabel.setBorder(border);

		// set component bounds (only needed by Absolute Positioning)
		flightIdLbl.setBounds(50, 105, 100, 25);
		deptTimeLbl.setBounds(50, 130, 100, 25);
		arrivalTimeLbl.setBounds(50, 155, 100, 25);
		originLbl.setBounds(50, 180, 100, 25);
		destinationLbl.setBounds(50, 205, 100, 25);
		custIdLbl.setBounds(270, 105, 100, 25);
		fnameLbl.setBounds(270, 130, 100, 25);
		snameLbl.setBounds(270, 155, 100, 25);
		contactNoLbl.setBounds(270, 180, 100, 25);
		bookingType.setBounds(270, 205, 100, 25);
		flightIdTf.setBounds(150, 105, 100, 25);
		depTimeTf.setBounds(150, 130, 100, 25);
		arrTimeTf.setBounds(150, 155, 100, 25);
		originTf.setBounds(150, 180, 100, 25);
		destTf.setBounds(150, 205, 100, 25);
		custIdTf.setBounds(370, 105, 100, 25);
		fnameTf.setBounds(370, 130, 100, 25);
		surnameTf.setBounds(370, 155, 100, 25);
		contactNoTf.setBounds(370, 180, 100, 25);
		bookingTypeTf.setBounds(370, 205, 100, 25);
		prevBtn.setBounds(210, 255, 85, 25);
		nextBtn.setBounds(320, 255, 85, 25);
		createBtn.setBounds(655, 100, 100, 25);
		updateBtn.setBounds(655, 130, 100, 25);
		deleteBtn.setBounds(655, 160, 100, 25);
		closeBtn.setBounds(670, 255, 70, 25);
		imageLabel.setBounds(485, 105, 120, 125);
		backupBtn.setBounds(640, 190, 125, 25);
		reportBtn.setBounds(640, 220, 125, 25);
		clockLbl.setBounds(681, 30, 110, 25);
		dateLbl.setBounds(681, 50, 110, 25);
		userLbl.setBounds(681, 10, 100, 25);
		loggedDescLbl.setBounds(640, 10, 100, 25);
		timeDescLbl.setBounds(640, 30, 45, 25);
		dateDescLbl.setBounds(640, 50, 45, 25);
		logoLbl.setBounds(160, 10, 300, 80);

		// add actionlisteners to buttons
		prevBtn.addActionListener(this);
		nextBtn.addActionListener(this);
		createBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		closeBtn.addActionListener(this);
		backupBtn.addActionListener(this);
		reportBtn.addActionListener(this);

		// populate textfields
		initialise();

		// create & initialise timer for real-time clock
		new Timer(1000, this).start();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null); // center Frame on screen
		setVisible(true);
	}

	public static void initialise() {
		try {
			ConnectionHelper.rs = ConnectionHelper.st.executeQuery("SELECT * FROM booking_info");

			// count number of booking records
			count = 0;
			while (ConnectionHelper.rs.next()) {
				count++;
				System.out.println("No, of Booking Records : " + count);

				// navigate the recordSet back to the first record
				ConnectionHelper.rs.first();
				current = 1;
				myBooking.setFlight_Id(ConnectionHelper.rs.getString("Flight_Id"));
				myBooking.setDeparture_Time(ConnectionHelper.rs.getString("Departure_Time"));
				myBooking.setArrival_Time(ConnectionHelper.rs.getString("Arrival_Time"));
				myBooking.setOrigin(ConnectionHelper.rs.getString("Origin"));
				myBooking.setDestination(ConnectionHelper.rs.getString("Destination"));
				myBooking.setCustomer_Id(ConnectionHelper.rs.getString("Customer_Id"));
				myBooking.setCustomer_Fname(ConnectionHelper.rs.getString("Customer_Fname"));
				myBooking.setCustomer_Sname(ConnectionHelper.rs.getString("Customer_Sname"));
				myBooking.setCustomer_Photo(ConnectionHelper.rs.getString("Customer_Photo"));
				myBooking.setCustomer_ContactNo(ConnectionHelper.rs.getString("Customer_Contact_No"));
				myBooking.setBooking_Type(ConnectionHelper.rs.getString("Booking_Type"));
				
				

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}