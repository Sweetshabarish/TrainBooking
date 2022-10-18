package Train;

import java.util.ArrayList;
import java.util.Date;
/*
 * This Class is created for displaying the Train1details and ther dates
 */
public class TrainDetailsDisplayClass {
	
	
	
	DateStroingClass DateCLassObject=new DateStroingClass();
	FileUserClass UserClassObject=new FileUserClass();
	
		
		TrainClass train3=new TrainClass("Venkatagiri Express","101001","BENGALURU","CHENNAI",DateCLassObject.Dateaddingmethod(),UserClassObject.arraylistobject);
		TrainClass train1=new TrainClass("Chatrapathi Express", "100101","Hubali","Yesvanthpuru",DateCLassObject.Dateaddingmethod(),UserClassObject.arraylistobject);
		  
	   
	    ArrayList<TrainClass> Arraylistobject=new ArrayList<>();
	     ArrayList<TrainClass> AddList() {
	    	
	    	Arraylistobject.add(train3);
	    	Arraylistobject.add(train1);
	    	
	    	return Arraylistobject;
	    }
	    		
	    
		void display() {
			System.out.println("================================================");
			System.out.println();
			System.out.println("Train Name: "+train3.getTrainName());
			System.out.println("Train Number: "+train3.getTrainNumber());
			System.out.println("Starting Location: "+train3.getStartLocation());
			System.out.println("EndLocation: "+train3.getEndLocation());
			
			System.out.println();
			System.out.println("================================================");
		}
		void displaytra() {
			System.out.println("================================================");
			System.out.println();
			System.out.println("Train Name: "+train1.getTrainName());
			System.out.println("Train Number: "+train1.getTrainNumber());
			System.out.println("Starting Location: "+train1.getStartLocation());
			System.out.println("EndLocation: "+train1.getEndLocation());
			
			System.out.println();
			System.out.println("================================================");
			
		}
		
	
}
