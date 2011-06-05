package com.andrios.prt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import android.content.Context;
import android.widget.Toast;


public class AndriosData implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6149357292077176082L;

	
	
	//Male
	int[] pushupMale17 = {42, 46, 49, 51, 60, 68, 76, 79, 82, 86, 91, 92};
	int[] pushupMale20 = {37, 42, 45, 47, 55, 64, 71, 74, 77, 81, 86, 87};
	int[] pushupMale25 = {34, 38, 41, 44, 51, 60, 67, 69, 73, 77, 82, 84};
	int[] pushupMale30 = {31, 35, 38, 41, 48, 57, 64, 67, 69, 74, 78, 80};
	int[] pushupMale35 = {27, 33, 35, 37, 44, 53, 60, 63, 65, 70, 74, 76};
	int[] pushupMale40 = {24, 29, 32, 34, 41, 50, 56, 59, 61, 67, 70, 72};
	int[] pushupMale45 = {21, 25, 28, 32, 37, 46, 52, 54, 57, 63, 66, 68};
	int[] pushupMale50 = {19, 23, 25, 30, 34, 43, 49, 51, 53, 59, 62, 64};
	int[] pushupMale55 = {10, 12, 14, 16, 32, 38, 46, 48, 52, 56, 59, 60};
	int[] pushupMale60 = { 8, 10, 12, 14, 23, 32, 44, 46, 48, 52, 56, 57};
	int[] pushupMale65 = { 4,  6,  8, 10, 18, 25, 36, 39, 41, 44, 46, 48};
	
	int[] situpMale17 = {50, 54, 59, 62, 71, 81, 90, 93, 98, 102, 107, 109};
	int[] situpMale20 = {46, 50, 54, 58, 66, 78, 87, 90, 94, 98, 103, 105};
	int[] situpMale25 = {43, 47, 50, 54, 62, 75, 84, 87, 91, 95, 100, 101};
	int[] situpMale30 = {40, 44, 47, 51, 59, 73, 81, 85, 88, 92, 97, 98};
	int[] situpMale35 = {37, 40, 43, 47, 55, 70, 78, 83, 85, 88, 93, 95};
	int[] situpMale40 = {35, 37, 39, 44, 51, 68, 76, 80, 83, 85, 90, 92};
	int[] situpMale45 = {31, 33, 35, 40, 47, 65, 73, 78, 80, 81, 86, 88};
	int[] situpMale50 = {29, 30, 32, 37, 44, 63, 71, 76, 77, 78, 84, 85};
	int[] situpMale55 = {26, 28, 30, 36, 40, 54, 62 ,66, 70, 74, 80, 81};
	int[] situpMale60 = {20, 22, 24, 26, 32, 40, 56, 62, 66, 70, 74, 75};
	int[] situpMale65 = {10, 13, 17, 20, 28, 36, 44, 50, 55, 60, 64, 65};
	
	// 1  2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18   19    20   21
	//60 120 180 240 300 360 420 480 540 600 660 720 780 840 900 960 1020 1080 1140 1200 1260
	int[] runMale17 = {750, 735, 720, 660, 630, 600, 585, 570, 555, 540, 525, 495};
	int[] runMale20 = {810, 795, 765, 720, 690, 645, 630, 600, 585, 555, 540, 510};
	int[] runMale25 = {840, 825, 803, 773, 735, 683, 652, 630, 615, 573, 563, 535};
	int[] runMale30 = {870, 855, 840, 825, 780, 720, 675, 660, 630, 600, 585, 560};
	int[] runMale35 = {900, 885, 863, 848, 803, 743, 683, 668, 638, 608, 593, 565};
	int[] runMale40 = {930, 915, 885, 870, 825, 765, 705, 675, 645, 615, 600, 570};
	int[] runMale45 = {968, 945, 915, 893, 848, 780, 728, 698, 668, 630, 608, 573};
	int[] runMale50 = {1005, 975, 945, 915, 870, 795, 750, 720, 690, 645, 615, 575};
	int[] runMale55 = {1029, 1011, 993, 975, 914, 853, 792, 749, 717, 685, 669, 642};
	int[] runMale60 = {1132, 1100, 1067, 1034, 967, 900, 833, 996, 760, 724, 708, 681};
	int[] runMale65 = {1252, 1231, 1213, 1194, 1146, 1098, 1050, 1027, 1003, 979, 961, 885};
	
	//Female
	int[] pushupFemale17 = {19, 20, 22, 24, 60 ,36, 42, 43, 45, 47, 50, 51};
	int[] pushupFemale20 = {16, 17, 20, 21, 28, 33, 39, 40, 43, 44, 47, 48};
	int[] pushupFemale25 = {13, 15, 18, 19, 26, 30, 37, 39, 41, 43, 45, 46};
	int[] pushupFemale30 = {11, 13, 15, 17, 24, 28, 35, 37, 39, 41, 43, 44};
	int[] pushupFemale35 = {9, 11, 13, 14, 22, 26, 34, 35, 37, 39, 42, 43};
	int[] pushupFemale40 = {7, 9, 11, 12, 20, 24, 32, 33, 35, 37, 40, 41};
	int[] pushupFemale45 = {5, 7, 8, 11, 18, 22, 30, 32, 33, 35, 39, 40};
	int[] pushupFemale50 = {2, 5, 6, 10, 16, 20, 28, 30, 31, 33, 37, 38};
	int[] pushupFemale55 = {2, 3, 5, 6, 10, 16, 20, 22, 24, 26, 28, 30};
	int[] pushupFemale60 = {2, 3, 4, 5, 8, 12, 16, 18, 20, 22, 24, 26};
	int[] pushupFemale65 = {1, 2, 3, 4, 6, 9, 12, 14, 16, 18, 20, 22};
	
	int[] situpFemale17 = {50, 54, 59, 62, 71, 81, 90, 93, 98, 102, 107, 109};
	int[] situpFemale20 = {46, 50, 54, 58, 66, 78, 87, 90, 94, 98, 103, 105};
	int[] situpFemale25 = {13, 17, 50, 54, 62, 75, 84, 87, 91, 95, 100, 101};
	int[] situpFemale30 = {40, 44, 47, 51, 59, 73, 81, 85, 88, 92, 97, 98};
	int[] situpFemale35 = {37, 40, 43, 47, 55, 70, 78, 83, 85, 88, 93, 95};
	int[] situpFemale40 = {35, 37, 39, 44, 51, 68, 76, 80,83, 85, 90, 92};
	int[] situpFemale45 = {31, 33, 35, 40, 47, 65, 73, 78, 80, 81, 86, 88};
	int[] situpFemale50 = {29, 30, 32, 37, 44, 63, 71, 76, 77, 78, 84, 85};
	int[] situpFemale55 = {26, 28, 30, 36, 40, 54, 62, 66, 70, 74, 80, 81};
	int[] situpFemale60 = {20, 22, 24, 26, 32, 40, 56, 62, 66, 70, 74, 75};
	int[] situpFemale65 = {10, 13, 17, 20, 28, 36, 44, 50, 55, 60, 64, 65};
	
	// 1  2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18   19    20   21
	//60 120 180 240 300 360 420 480 540 600 660 720 780 840 900 960 1020 1080 1140 1200 1260
	int[] runFemale17 = {900, 885, 855, 810, 780, 765, 750, 720, 705, 690, 675, 569};
	int[] runFemale20 = {930, 915, 900, 855, 825, 810, 795, 765, 735, 690, 675, 587};
	int[] runFemale25 = {968, 945, 923, 893, 870, 840, 803, 780, 750, 705, 690, 617};
	int[] runFemale30 = {1005, 975, 945, 930, 915, 870, 810, 795, 765, 720, 705, 646};
	int[] runFemale35 = {1020, 998, 975, 953, 930, 878, 825, 803, 773, 728, 713, 651};
	int[] runFemale40 = {1035, 1020, 1005, 975, 945, 885, 840, 810, 780, 735, 720, 656};
	int[] runFemale45 = {1043, 1028, 1013, 990, 953, 900, 848, 825, 795, 750, 728, 658};
	int[] runFemale50 = {1050, 1035, 1020, 1005, 960, 915, 855, 840, 810, 765, 735, 660};
	int[] runFemale55 = {1123, 1098, 1083, 1068, 1018, 969, 920, 993, 865, 837, 819, 743};
	int[] runFemale60 = {1183, 1165, 1148, 1131, 1086, 1037, 985, 960, 934, 908, 890, 814};
	int[] runFemale65 = {1252, 1231, 1213, 1194, 1146, 1098, 1050, 1027, 1003, 979, 961, 885};
	
	
	public AndriosData(){
		
		
	}
	

	/**
	 * Getter Methods
	 */
	
	
	
	
	/**
	 * Setter Methods
	 */
	

	
	


	
	public void write(Context ctx){
		AndriosData writableData = null;
		try {
			writableData = (AndriosData) this.clone();
		} catch (CloneNotSupportedException e1) {
			e1.printStackTrace();
		}
		
		
		try {
		
			FileOutputStream fos;
			fos = ctx.openFileOutput("data", Context.MODE_PRIVATE);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(writableData);

			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
			Toast.makeText(ctx, "Error: Writing to file",
					Toast.LENGTH_SHORT).show();
		}
	}













	
}