import java.util.Random;
import java.util.Scanner;
public class platform1 {

	
	String[] station = { "PhayaThai", "Ratchaprarop","Makkasan","Ramkhamhaeng", "Huamark " , 
			"BanThapChang", "LatKrabang", "Suvarnabhumi"}; 

	Random rand = new Random();
	
	public void traveltime(int start, int end) {
		int totaltime = 0;
		
		System.out.println("------------------------------------------------");
		System.out.println("Start\t\t" + " | "+ "\t" + " End\t   " + " | "+ "\t" + "Time");
		System.out.println("------------------------------------------------");
		
		
		// use for loop to repeat the loops until the answer is false
	if (start < end) {
		for (int i = start; i < end; i++) { 
		int time = rand.nextInt(9)+2; // random the number between 2-10
		System.out.println(station[i]+ "\t-> " + station[i+1] + "\t    |\t" + time + " mins");// show the station from 0-6 and time travel to each station
		totaltime += time; 
		}
	
		System.out.println("------------------------------------------------");
		System.out.println("Total Travel Time: " + totaltime +" mins");
		}
	}
	
}
