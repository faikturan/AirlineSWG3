package com.faikturan;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
//input stream: Girdi Akýþý output stream: Çýktý akýþý
public class Serialization {
	static FileOutputStream fos = null;
	static ObjectOutputStream out = null;
	static FileInputStream fis = null;
	static ObjectInputStream in = null;
	static String filename = "C:\\Reports\\booking.ser";
	static Booking myBooking = new Booking();
	
	public static void serialize(Booking anObject){
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			
			//serialize abject to file
			out.writeObject(anObject);
			
			//close resources
			out.close();
		} catch (Exception ex) {
			System.out.println("Seralize Method Exception : " +ex);
			ex.printStackTrace();
		}
	}
	
	public static void deserialize(){
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			
			//deserialize object from file
			myBooking = (Booking) in.readObject();
			
			//close resources
			in.close();
		} catch (Exception ex) {
			System.out.println("DeSerialize Method Exception: " +ex);
			ex.printStackTrace();
		}finally {
			generateHtmlPage(myBooking);
		}
	}

	private static void generateHtmlPage(Booking booking) {
		try {
			OutputStream htmlfile = new FileOutputStream(new File("C:\\Reports\\Report.html"));
			PrintStream printhtml = new PrintStream(htmlfile);
			
			//create String objects
			String htmlheader = "<html><head>";
			htmlheader+="<title>Ýsmek Airline Report</title>";
			htmlheader+="</head><body>";
			String createTable = "<table border='1' align='center'>";
			String closeTable ="</table>";
			String htmlfooter = "</body></html>";
			
			//buil Html page & write to file
			printhtml.println(htmlheader + createTable);
			printhtml.println("<center><img src='../resources/airline.jpg' alt='Ýsmek Airline Logo'>"
					+ "</center>");
			printhtml.println("<H1 align='center'>Booking Report</H1>");
			printhtml.println("<tr><th>Flight ID: </th><td>"+booking.getFlight_Id()
			+"</td><th>Customer ID: </th><td>"+booking.getCustomer_Id()+"</td></tr>");
			printhtml.println("<tr><th>Departure Time: </th><td>"+booking.getDeparture_Time()
			+"</td><th>First Name: </th><td>"+booking.getCustomer_Fname()+"</td></tr>");
			printhtml.println("<tr><th>Arrival Time: </th><td>"+booking.getArrival_Time()
			+"</td><th>Surname : </th><td>"+booking.getCustomer_Sname()+"</td></tr>");
			printhtml.println("<tr><th>Origin : </th><td>"+booking.getOrigin()
			+"</td><th>Flight Contact No: </th><td>"+booking.getCustomer_ContactNo()+"</td></tr>");
			printhtml.println("<tr><th>Destination : </th><td>"+booking.getDestination()
			+"</td><th>Booking Type : </th><td>"+booking.getBooking_Type()+"</td></tr>");
			printhtml.println(closeTable + htmlfooter);
			
			//open Html page in the default browser
			String htmlFilePath = "C:\\Reports\\Report.html";//path to where html document is stored
			File htmlFile = new File(htmlFilePath);
			Desktop.getDesktop().browse(htmlFile.toURI());//open file in default browser
			
			//close resources
			printhtml.close();
			htmlfile.close();	
		} catch (Exception ex) {
			System.out.println("Exception in generateHtmlPage Method :" +ex);
		}
		
	}

	
}
