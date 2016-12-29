package com.faikturan;

import java.io.Serializable;

public class Booking implements Serializable {
	
	String flight_Id;
	String departure_Time;
	String arrival_Time;
	String origin;
	String destination;
	String customer_Id;
	String customer_Fname;
	String customer_Sname;
	String customer_Photo;
	String customer_ContactNo;
	Booking_Type booking_Type;
	
	//enumarator for booking type variable
	public static enum Booking_Type{
		Not_Selected, 
		Economy,
		Business
	}
	
	public Booking() {
		this.flight_Id= "";
		this.departure_Time = "";
		this.arrival_Time = "";
		this.origin = "";
		this.destination = "";
		this.customer_Id = "";
		this.customer_Fname = "";
		this.customer_Sname = "";
		this.customer_Photo = "";
		this.customer_ContactNo = "";
		this.booking_Type = Booking_Type.Not_Selected;
	}

	
	public Booking(String flight_Id, String departure_Time, String arrival_Time, String origin, String destination,
			String customer_Id, String customer_Fname, String customer_Sname, String customer_Photo,
			String customer_ContactNo, Booking_Type booking_Type) {
		super();
		this.flight_Id = flight_Id;
		this.departure_Time = departure_Time;
		this.arrival_Time = arrival_Time;
		this.origin = origin;
		this.destination = destination;
		this.customer_Id = customer_Id;
		this.customer_Fname = customer_Fname;
		this.customer_Sname = customer_Sname;
		this.customer_Photo = customer_Photo;
		this.customer_ContactNo = customer_ContactNo;
		this.booking_Type = booking_Type;
	}

	public String getFlight_Id() {
		return flight_Id;
	}

	public void setFlight_Id(String flight_Id) {
		this.flight_Id = flight_Id;
	}

	public String getDeparture_Time() {
		return departure_Time;
	}

	public void setDeparture_Time(String departure_Time) {
		this.departure_Time = departure_Time;
	}

	public String getArrival_Time() {
		return arrival_Time;
	}

	public void setArrival_Time(String arrival_Time) {
		this.arrival_Time = arrival_Time;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Fname() {
		return customer_Fname;
	}

	public void setCustomer_Fname(String customer_Fname) {
		this.customer_Fname = customer_Fname;
	}

	public String getCustomer_Sname() {
		return customer_Sname;
	}

	public void setCustomer_Sname(String customer_Sname) {
		this.customer_Sname = customer_Sname;
	}

	public String getCustomer_Photo() {
		return customer_Photo;
	}

	public void setCustomer_Photo(String customer_Photo) {
		this.customer_Photo = customer_Photo;
	}

	public String getCustomer_ContactNo() {
		return customer_ContactNo;
	}

	public void setCustomer_ContactNo(String customer_ContactNo) {
		this.customer_ContactNo = customer_ContactNo;
	}

	public Booking_Type getBooking_Type() {
		return booking_Type;
	}

	public void setBooking_Type(Booking_Type booking_Type) {
		this.booking_Type = booking_Type;
	}

	@Override
	public String toString() {
		return "Booking [flight_Id=" + flight_Id + ", departure_Time=" + departure_Time + ", arrival_Time="
				+ arrival_Time + ", origin=" + origin + ", destination=" + destination + ", customer_Id=" + customer_Id
				+ ", customer_Fname=" + customer_Fname + ", customer_Sname=" + customer_Sname + ", customer_Photo="
				+ customer_Photo + ", customer_ContactNo=" + customer_ContactNo + ", booking_Type=" + booking_Type
				+ "]";
	}
	
	
	
	
	
	

}
