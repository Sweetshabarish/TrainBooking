package Train;

import java.util.ArrayList;
/*
 * this module is created for creating the structure for getting the train deatils 
 */
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class TrainClass {
	public String TrainName;
	
	public String TrainNumber;
	String StartLocation;
	String EndLocation;
	ArrayList<TrainDate>dateobject;
	ArrayList<TrainBookingDeatilsStroingModule>Tickets;
	
	//int seats;
	
	public TrainClass(String TrainName,String TrainNumber,String StartLocation,String EndLocation,ArrayList<TrainDate> arrayobject,ArrayList<TrainBookingDeatilsStroingModule>Tickets) {
		this.TrainName=TrainName;
		
		this.TrainNumber=TrainNumber;
		this.StartLocation=StartLocation;
		this.EndLocation=EndLocation;
		this.dateobject= arrayobject;
		this.Tickets= Tickets;
		
		
		
		
		
	}
	
	
	public String getTrainName() {
		return TrainName;
	}

	public void setTrainName(String trainName) {
		TrainName = trainName;
	}

	

	

	public String getTrainNumber() {
		return TrainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		TrainNumber = trainNumber;
	}

	public String getStartLocation() {
		return StartLocation;
	}

	public void setStartLocation(String startLocation) {
		StartLocation = startLocation;
	}

	public String getEndLocation() {
		return EndLocation;
	}

	public void setEndLocation(String endLocation) {
		EndLocation = endLocation;
	}

	
	

	

	public ArrayList<TrainDate> getDateobject() {
		return dateobject;
	}

	public void setDateobject(ArrayList<TrainDate> dateobject) {
		this.dateobject = dateobject;
	}
	public ArrayList<TrainBookingDeatilsStroingModule> getTickets() {
		return Tickets;
	}

	public void setTickets(ArrayList<TrainBookingDeatilsStroingModule> tickets) {
		Tickets = tickets;
	}

	@Override
	public String toString() {
		return "TrainName=" + TrainName +"\n"+
	           "TrainNumber="+ TrainNumber+"\n" + 
				"StartLocation=" + StartLocation +"\n "+"EndLocation=" + EndLocation  + "\n"+"Date: "+dateobject;
	}
	
	
	

}
