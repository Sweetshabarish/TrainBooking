package Train;
/*
 * This class done for generating the pnr number and returned class were ,this method is called
 */
public class GeneratePnrNumber {
	String Pnr;
	
	
//	public static String getPnr() {
//		return PnrNumber();
//	}


	

	public static String getPnrNumber() {
	
	int min = 100000;  
	int max = 900000;  
	int b = (int)(Math.random()*(max-min+1)+min);  
	return "PNR"+b;
	} 
	
}
