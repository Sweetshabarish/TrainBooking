package Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {//Creating main method for running the project
	static TrainStoringDetailsClass trainStoringClassObject=new TrainStoringDetailsClass();//Creating object called trainStoringClassObject for acccesing the method called addlist ,where it contains all the Train Details

	static DisplayTrainDeatilsClass displayClasObject=new DisplayTrainDeatilsClass();
	
	
	 
	public static void main(String[] args) {
		Scanner scannerObject=new Scanner(System.in);//Creating Scannerobject to get date from the user
	
		
		Booking bookingClassObject=new Booking();//Creating the object for acessing the Booking class to book the ticket

		  t:  while(true)//checking the condition
		    {
		        System.out.println(" \n");
		        System.out.print("1.Trains\n2.Dates of Train \n3.Booking\n4.FlowChart\n5.ExitEnter Choice: ");//displaying the methods that user can access
		        int choice=scannerObject.nextInt();//from display ,going to  choosing the class to run the method.
		        scannerObject.nextLine();//getting the input from the user for choose the option given .
		       
		        switch(choice)
		        {
		            case 1://case 1 condition
		            	trainStoringClassObject.AddList();//this Object created by class called Trainstroingclass where we can see the train details
		            	displayClasObject.dsiplay();//display the train details
		                break;
		            case 2:
		            	DatesofTrain DateofTrainObject=new DatesofTrain();//Created this object,method to acess the the method and display it.It contains date of the particular trains
		            	DateofTrainObject.datesoftrain();//this method will call from the DatsofTrain and display the dates 
		            	break;
		            
		            case 3:
		            	bookingClassObject.booking();//this method is called from the booking class where we can strat the booking process
		                break;
		            
		            case 4:
		            	FlowCLass flowclassobject=new FlowCLass();// this object is created for aces the flowclass 
		            	flowclassobject.flow();//where this method we can acess the method and display all the user details
		            	break;
		            case 5:
		            	break t;//to break the loop
		           
		            default:
		                System.out.println("Invalid Input");
		        }
		      
		    }
		  
//		Date1Class d=new Date1Class();
//		d.Datelis();
//		ArrayList<TrainClass>arrayobject=d.AddList();
//       
//		for(TrainClass object:arrayobject) {
//			object.setSeats(object.getSeats()-1);
//			FIleUSerCLass.AddlList();
//			break;
//			
//			
//			
//		}
//
//		System.out.println(FIleUSerCLass.arraylistobject1);
//		System.out.println(d.train3.seats);
//		
//		
//	}

}
}
