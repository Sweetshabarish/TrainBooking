package Train;

import java.util.Scanner;

/*
 * This class is created for displaying the all the customer tickets . 
 */
public class FlowCLass {
	Scanner scannerObject=new Scanner (System.in); 
	TrainStoringDetailsClass trainStoringClassObject=new TrainStoringDetailsClass();
	void flow() {
		System.out.println("=========================================================");
		System.out.println("_____________TRAIN BOOKING PASSANGER DETAILS_____________");
		System.out.println("=========================================================");
		System.out.println();
		System.out.println();
		t:while(true) {
			System.out.println("1.VenkataGiriexpress");
			System.out.println("2.ChatrapathiExpress");
			System.out.println("3.Exit");
		    int choise =scannerObject.nextInt();
		    switch(choise) {
		    case 1:{
		    	
		      for(int index=0;index<trainStoringClassObject.train1.Tickets.size();index++) {
		    	  System.out.println("=========================================================");
			    	System.out.println();
		    	  System.out.println("NAME: "+trainStoringClassObject.train1.getTickets().get(index).getName());
		    	  System.out.println("LOCATION: "+trainStoringClassObject.train1.getTickets().get(index).getLocation());
		    	  System.out.println("DESTINATION: "+trainStoringClassObject.train1.getTickets().get(index).getDestination());
		    	  System.out.println("PHONENUMBER: "+trainStoringClassObject.train1.getTickets().get(index).getPhonenumber());
		    	  System.out.println("TRAIN NUMBER: "+trainStoringClassObject.train1.getTickets().get(index).getTrainNumber());
		    	  System.out.println("DATE: "+trainStoringClassObject.train1.getTickets().get(index).getDate());
		    	  System.out.println("PNR NUMBER: "+trainStoringClassObject.train1.getTickets().get(index).getPnr());
		    	  System.out.println();
		    	  System.out.println("=========================================================");
		    	  
		      }
		    	  break;
		    	  
		    }
		    case 2:{
		    	
		    	for(int index=0;index<trainStoringClassObject.train2.Tickets.size();index++) {
		    		System.out.println("=========================================================");
			    	System.out.println();
			    	  System.out.println("NAME: "+trainStoringClassObject.train2.getTickets().get(index).getName());
			    	  System.out.println("LOCATION: "+trainStoringClassObject.train2.getTickets().get(index).getLocation());
			    	  System.out.println("DESTINATION: "+trainStoringClassObject.train2.getTickets().get(index).getDestination());
			    	  System.out.println("PHONENUMBER: "+trainStoringClassObject.train2.getTickets().get(index).getPhonenumber());
			    	  System.out.println("TRAIN NUMBER: "+trainStoringClassObject.train2.getTickets().get(index).getTrainNumber());
			    	  System.out.println("DATE: "+trainStoringClassObject.train2.getTickets().get(index).getDate());
			    	  System.out.println("PNR NUMBER: "+trainStoringClassObject.train2.getTickets().get(index).getPnr());
System.out.println();
			    	  
			    	  System.out.println("=========================================================");
			    	  
		    	}
		    	break;
		    	
		    }
		    case 3:
		    	break t;
		}
		}
	}
}
