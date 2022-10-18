package Train;

import java.util.ArrayList;
/*
 * this class os created for storing the customer deails in module manner
 */
import java.util.Scanner;

public class TrainBookingDeatilsStroingModule {
	
	 
	 Scanner sc=new Scanner(System.in);
	String Name;
	String Location;
	String Destination;
	String Date;
	int PhoneNumber;
	int TrainNumber;
	String Pnr;
	
	
		
	
	//the method to set the details
	TrainBookingDeatilsStroingModule(boolean b){
		if(b) {
		setName();
		setLocation();
		setDestination();
		setDate();
		setPhonenumber();
		setTrainNumber();
		}
		
		
	}
	//setter methods starts here
	public void setName() {
		System.out.println("Enter the name");
		Name=sc.next();
		
	}
	public void setLocation() {
		System.out.println("Enter the location");
		Location=sc.next();
	}
	public void setDestination() {
		System.out.println("Enter the Destibation");
		Destination=sc.next();
	}
	public void setDate() {
		System.out.println("Enter the Date of the journey");
		Date=sc.next();
	}
	public void setPhonenumber(){
		System.out.println("Enter the Phone number");
		PhoneNumber=sc.nextInt();
	}
	public void setTrainNumber(){
		System.out.println("Enter the Train number");
		TrainNumber=sc.nextInt();
	}
	public void setPnr(String pnr) {
		Pnr=pnr;
	}
	//geter methods starts here

	public String getPnr() {
		return Pnr;
	}
	
	
	
	public String getName() {
		return Name;
	}

	
	public String getLocation() {
		return Location;
	}

	

	public String getDestination() {
		return Destination;
	}

	

	public String getDate() {
		return Date;
	}
	
	public int getPhonenumber() {
		return PhoneNumber;
	}
	public int getTrainNumber() {
		return TrainNumber;
	}
	@Override
	public String toString() {
		return "TrainBooking [ Name=" + Name + ", Location=" + Location + ", Destination=" + Destination
				+ ", Date=" + Date + ", PhoneNumber=" + PhoneNumber + ", Train NUmber="+TrainNumber+"]";
	}
	
	
	


}
