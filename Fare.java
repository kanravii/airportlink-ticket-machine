import java.util.Scanner;
public class Fare {

	String[] stations = {
		    "Suvarnabhumi", "Lat Krabang", "Ban Thap Chang", "Hua Mak", 
		    "Ramkhamhaeng", "Makkasan", "Ratchaprarop", "Phaya Thai"
		};
	
	

	int[][] fareMatrix = {
	    {0, 15, 20, 25, 30, 35, 40, 45},
	    {15, 0, 15, 20, 25, 30, 35, 40},
	    {20, 15, 0, 15, 20, 25, 30, 35},
	    {25, 20, 15, 0, 15, 20, 25, 30},
	    {30, 25, 20, 15, 0, 15, 20, 25},
	    {35, 30, 25, 20, 15, 0, 15, 20},
	    {40, 35, 30, 25, 20, 15, 0, 15},
	    {45, 40, 35, 30, 25, 20, 15, 0}
	};
	
	public int getFare(int start, int end) {
		if (start >= 0 && end >= 0 && start < fareMatrix.length && end < fareMatrix.length) {
			return fareMatrix[start][end];
		} else {
			System.out.println("Invalid station");
			return -1;
		}
	}
	

}