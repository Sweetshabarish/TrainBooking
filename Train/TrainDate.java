package Train;
/*
 * This class created is for storing the date 
 */
public class TrainDate {  //TrainDate
  String Date;
  Integer seats;
  //creating the constructor
  public TrainDate(String Date,Integer seats) {
	  this.Date=Date;
	  this.seats=seats;
	  
  }
//creating the getter and setter
public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

public Integer getSeats() {
	return seats;
}

public void setSeats(Integer seats) {
	this.seats = seats;
}

@Override
public String toString() {
	return "Dates=" + Date + ", Number of Seats=" + seats + "\n";
}
  
}
