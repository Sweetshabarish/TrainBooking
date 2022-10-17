package Train;

import java.util.ArrayList;
import java.util.HashMap;
/*
 * Creating the class for storing the date from another class datestoringclass. 
 */
public class DateStroingClass {
	//adding the date and storing in the arraylist for accesing the class
	TrainDate date1=new TrainDate("19/09/2022",5);
	TrainDate date2=new TrainDate("20/09/2022",5);
	TrainDate date3=new TrainDate("21/09/2022",5);
	TrainDate date4=new TrainDate("22/09/2022",5);
	
	
	
	
	ArrayList<TrainDate> arrayobject=new ArrayList<>();
	
	ArrayList<TrainDate> Dateaddingmethod(){
		arrayobject.add(date1);
		arrayobject.add(date2);
		arrayobject.add(date3);
		arrayobject.add(date4);
		
		return arrayobject;
		
	}
	
	
//	public static void main(String[] args) {
//		DateStroingClass2 s=new DateStroingClass2();
//		s.Dateaddingmethod();
//		System.out.println(s.arrayobject);
//	}
	
		
		
	

}
