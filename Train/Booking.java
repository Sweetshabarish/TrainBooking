package Train;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Booking {
	/*
	 * The Class where Where we can book the ticket particuar Trains.
	 */
	
	DisplayTrainDeatilsClass dateTrainDetailsobject=new DisplayTrainDeatilsClass();//This Object  created for displaying the dates available for particular train
	private Scanner sscannerclassobject=new Scanner(System.in);//Scanner Object to get Input from the user
	
	/*
	 * Booking method will run the process for booking the ticket
	 */
	void booking() {
		
	
		
		t:while(true) {//if true it will go for the process
		
		System.out.println("================================================");
		System.out.println();
		 System.out.println("1:Book the Train");
		 
		 System.out.println("2:Exit");
		 System.out.println();
		 System.out.println("================================================");
			int choise=sscannerclassobject.nextInt();//creating variable for choise because to get input from the user to choose particular option given below
		switch(choise) {
	      /*
	       * We can create two train in one class,created in one but,to understand the process splited in two class for different trains
	       */
		case 1:
			BookingWorkingClass train1Classworkingobject=new BookingWorkingClass();//Object is created from Train1Class to ascces the method present in that.
			train1Classworkingobject.TrainCLassworkingmethod();// This method is called from Train1ClassWorking class ,where Train " Venkatgiri Express" will run ,and we can book there
			
			break;
		
		
		case 2:
			 break t;// break the loop for to check nect Conditions
		
		}
		}
		
	}

}
