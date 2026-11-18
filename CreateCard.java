import java.util.Random;

import java.util.Scanner;

public class CreateCard {

	private int cardID;
	private String name;
	private int age;
	private String cardType;
	private double balance;
	private boolean hasPaid;
	
	public CreateCard() {
		
	}
	
	public CreateCard(String name, int age, String cardType, double balance, boolean hasPaid) {
		this.cardID = generateCardID();
		this.name = name;
		this.age = age;
		this.cardType = cardType;
		this.balance = balance;
		this.hasPaid = hasPaid;
	}
	
	public static String CheckValidCardType(String cardType, int age) {
	    int attempts = 0;
	    while (attempts < 3) {
	        if (cardType.equalsIgnoreCase("Senior") && age < 60) {
	            System.err.println("Error: Senior card is only for customers aged 60 and above.");
	        } else if (cardType.equalsIgnoreCase("Student") && age >= 23) {
	            System.err.println("Error: Student card is only for customers younger than 23.");
	        } else if (!cardType.equalsIgnoreCase("Normal") &&
	                   !cardType.equalsIgnoreCase("Senior") &&
	                   !cardType.equalsIgnoreCase("Student")) {
	            System.err.println("Error: Invalid card type selected.");
	        } else {
	            return cardType;
	        }

	        attempts++;
	        if (attempts < 3) {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Please enter a valid card type (Normal / Senior / Student): ");
	            cardType = sc.next();
	        }
	    }

	    return null; // failed after 3 attempts
	}

	
	
//	public static boolean ProcessPayment() {
//		
//		Scanner sc = new Scanner(System.in);
//		final double requiredFee = 180.0;
//		double totalPaid = 0.0;
//		int attempts = 0;
//		while ((attempts < 2) && (totalPaid < requiredFee) ) {
//			double remainingFee = requiredFee -totalPaid;
//			System.out.println("Please pay the registration fee (฿" + remainingFee + "remaining): ฿");
//			double payment = sc.nextDouble();
//			
//			if (payment <= 0) {
//				System.out.println(" Invalid Input. Please enter a positive amount");
//				continue;	
//			}
//			totalPaid += payment;
//			attempts++;
//			
//			if (totalPaid < requiredFee) {
//				System.out.println("Still need ฿" + (requiredFee - totalPaid));
//			}
//		}
//		
//		if (totalPaid >= requiredFee) {
//            if (totalPaid > requiredFee) {
//                double change = totalPaid - requiredFee;
//                System.out.println("Payment successful. Your change is ฿" + change);
//            } else {
//                System.out.println("Payment successful.");
//            }
//            return true;
//        }
//		if (attempts == 1) {
//            System.out.println(" Still need ฿" + (requiredFee - totalPaid) + ". One more attempt allowed.");
//        }
//    
//		 // If user fails after 2 tries
//	    System.out.println(" Payment failed after 2 attempts.");
//	    return false;
//	}
	
	private int generateCardID() {
		Random rand = new Random();
		int id = 100000 + rand.nextInt(900000);
		return id;
	}
	
	public void topUp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to top up: ฿");
		double amount = sc.nextDouble();
		
		if (amount > 0) {
			balance += amount;
			System.out.println("Top-up successful. New balance: ฿"+ balance);
		} else {
			System.out.println("Invalid amount. Please enter a positive number.");
		}
	}
	
	
	public void displayCardInfo() {
		System.out.println("\n\n===== Airport Rail Link Card Info =====");
		System.out.println("Card ID: " + cardID);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Card Type: " + cardType);
		System.out.println("Paid Registration Fee: " + hasPaid);
		System.out.println("Current Card Balance: " + balance);
		System.out.println("=======================================");

	
	}
	
	
	
	//Getters
	public int getCardID() {
		return cardID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCardType() {
		return cardType;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isHasPaid() {
		return hasPaid;
	}

	//Setter
	
	public void setHasPaid(boolean hasPaid) {
		this.hasPaid = hasPaid;
		if (hasPaid && balance ==0.0) {
			balance = 100.0; // Assigning initial balance only once
		}
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	  public void callCreateCard() {
  		// TODO Auto-generated method stub
  	Scanner sc = new Scanner(System.in);
  		System.out.println("=== Welcome to Airport Rail Link Card Registration ===");
  		
  	
  		System.out.print("Enter your full name: ");
  		String name = sc.nextLine();
  		
  		System.out.print("Enter your age: ");
  		int age = sc.nextInt();
  		
  		System.out.println(" _____________________________________________________________________________");
  		System.out.println("|               |                                                             |");
  		System.out.println("|Card Type:     |    Normal    |         Senior          |        Student     |");
  		System.out.println("|Criteria:      | For everyone |    60 years and above   |   Younger than 23  |");
  		System.out.println("|Price:         |     ฿180     |           ฿180          |         ฿180       |");
  		System.out.println("|Discount rate: |      0%      |           50%           |          20%       |");
  		System.out.println("|_______________|_____________________________________________________________|");
  		
  		System.out.print("\nSelect Card Type (Normal / Senior / Student): ");
  		
  		String CardType = sc.next();
  		 // Validate card type based on age
          String validType = CreateCard.CheckValidCardType(CardType, age);
  		CreateCard cardCriteria = new CreateCard();
  		
  		System.out.println("\n");
  		//Payment Process
  	    paymentProcess pp = new paymentProcess();
  	    pp.requiredFee=180.00;
  		boolean hasPaid = pp.payment();
  		
  		
  		if (!hasPaid) {
  			System.err.println("Registration Canceled");
  			return;
  		}
  		
  		//Create Card
  		CreateCard custCard = new CreateCard(name, age, CardType, 0.0, hasPaid);
  		custCard.setHasPaid(true);

  		custCard.displayCardInfo();
  		
  		System.out.print("\nWould you like to top up your card? (yes/no): ");
  		String choice = sc.next();

  		if (choice.equalsIgnoreCase("yes")) {
  		    topUp.processTopUpCreate(custCard);
            System.out.println("\n\n      Thank you for using our services!");
  		} else {
            System.out.println("\n\n      Thank you for using our services!");
  		}
  		
  	
  	}
}
