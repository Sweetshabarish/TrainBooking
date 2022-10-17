package Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
/*
 * This class is created for storing the train details in the some methods.
 */
public class TrainStoringDetailsClass {
	
	//public TrainClass(String TrainName,String TrainStops[],String TrainNumber,String StartLocation,String EndLocation,String Date[])
	//ArrayList<Train.DateStroingClass2> object1=
	 DateStroingClass object=new DateStroingClass();
	 DateStroingClass objectone=new DateStroingClass();
	FileUserClass UserClassObjectone=new FileUserClass();
	FileUserClass UserClassObjecttwo=new FileUserClass();


	   TrainClass train1=new TrainClass("Venkatagiri Express","101001","BENGALURU","CHENNAI",object.Dateaddingmethod(),UserClassObjectone.arraylistobject);//dateß                                                                                          
      TrainClass train2=new TrainClass("Chatrapathi Express", "100101","Hubali","Yesvanthpuru",objectone.Dateaddingmethod(),UserClassObjecttwo.arraylistobject);
   
     ArrayList<TrainClass> Arraylistobject=new ArrayList<>();
     ArrayList<TrainClass> AddList() {
    	Arraylistobject.add(train1);
    	Arraylistobject.add(train2);
    	return Arraylistobject;
    }
    		
    

}
