import java.util.Random;
import java.util.Scanner;
public class topUp {
	
	public static void processTopUpCreate(CreateCard card) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter amount to top up: ฿");
	double amount = sc.nextDouble();
	
	if (amount > 0) {
		double newBalance = card.getBalance() + amount;
		card.setBalance(newBalance);
		System.out.print("Top-up successful. New balance: ฿" + newBalance);
		
	} else {
		System.out.println("Invalid amount. Please enter a positive number.");
	}
	
  }
	

	    private static double randomBalance; // static field to keep balance consistent

	    static {
	        Random rand = new Random();
	        randomBalance = Math.round( ((100) * rand.nextDouble()) * 100.0) / 100.0; //between 0.00 and 100.00
	    }
	
	    
	public void processtopUp() {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("=====================TOP UP=====================");
	    System.out.println("Initial Balance: ฿" + randomBalance);
	    System.out.print("Enter amount to top up (must be positive): ฿");
	       double amount = sc.nextDouble();
	   
	       while (amount <= 0) {
	    	System.err.println("Error: Invalid amount. Please enter a positive number.");
	        System.out.print("Enter amount to top up (must be positive): ฿");
	        amount = sc.nextDouble();

	      
	        }
	    
	       randomBalance += amount;
	       System.out.printf("Top-up successful. New balance: ฿" + randomBalance);
	       System.out.println("\n=====================TOP UP=====================");


	}

	
	}
 