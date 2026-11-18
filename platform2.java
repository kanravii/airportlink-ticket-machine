import java.util.Random;

public class platform2 {

	
String[] station = { "Suvarnabhumi", "LatKrabang","BanThapChang", "Huamark ", "Ramkhamhaeng", 
			"Makkasan", "Ratchaprarop", "Phayathai"}; 

Random rand = new Random();

public void travel(int start, int end) {
int totaltime = 0;

System.out.println("------------------------------------------------");
System.out.println("Start\t\t" + " | "+ "\t" + " End\t   " + " | "+ "\t" + "Time");
System.out.println("------------------------------------------------");


// use for loop to repeat the loops until the answer is false
if (start < end) {
for (int i = start; i < end; i++) { 
int time = rand.nextInt(9)+2; // random the number between 2-10
System.out.println(station[i] + "\t-> " + station[i+1] + "\t    |\t" + time + " mins"); // show the station from 0-6 and time travel to each station 
totaltime += time;  

}

System.out.println("------------------------------------------------");
System.out.println("Total Travel Time: " + totaltime +" mins");
}
}

}












	

