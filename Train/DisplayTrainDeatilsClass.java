package Train;
/*
 * This class is created for displaying the train name and deatils in main class
 */
public class DisplayTrainDeatilsClass {
	TrainStoringDetailsClass trainObject=new TrainStoringDetailsClass();
	  void dsiplay() {
    	System.out.println("================================================");
    	System.out.println("               TRAIN NAMES");
    	System.out.println("               ------------");
    	System.out.println("================================================");
		System.out.println();
		System.out.println("Train Name: "+trainObject.train1.getTrainName());
		System.out.println("Train Number: "+trainObject.train1.getTrainNumber());
		System.out.println("Starting Location: "+trainObject.train1.getStartLocation());
		System.out.println("EndLocation: "+trainObject.train1.EndLocation);

		System.out.println();
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println();
		System.out.println("Train Name: "+trainObject.train2.getTrainName());
		System.out.println("Train Number: "+trainObject.train2.getTrainNumber());
		System.out.println("Starting Location: "+trainObject.train2.getStartLocation());
		System.out.println("EndLocation: "+trainObject.train2.EndLocation);
		
		System.out.println();
		System.out.println("================================================");
    }

}
