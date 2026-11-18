import java.util.Scanner;

public class buyTicket {

	public void platform1() {
		// TODO Auto-generated method stub

		platform1 train = new platform1();;
		Scanner sc = new Scanner(System.in);
		int start,end;
		int attempt = 0;

			
		while (attempt < 2){
				
			System.out.println("Stations:");
			
		for(int i = 0; i < train.station.length; i++) {
			System.out.println(i + ": " + train.station[i]);
				
				}
			
		System.out.print("Enter the starting station (0 to 6):");
		start = sc.nextInt();
			
		System.out.print("Enter the ending station " + "(" + (start + 1) + " to 7):");
		end = sc.nextInt();
		
		
		//Fare Information
		 System.out.println("\n\nFare Information:");
		 Fare f = new Fare();
		 int baseFare = f.getFare(start, end);
         System.out.print("Base Fare: ฿" + baseFare);
		
     	System.out.println("\n");
        //Apply Discount 
         DiscountCard card = new DiscountCard();
         card.displayDiscount(); // Shows type and rate
         double discountedFare = card.applyDiscount(baseFare);
         System.out.println("Discounted Fare: ฿" + discountedFare);
		
     	System.out.println("\n");
        //Payment Process
         paymentProcess pp = new paymentProcess();
         pp.requiredFee=discountedFare;
         pp.payment();
         System.out.println("Here is your Token.");
         
		//Time
		if (start >= 0 &&  end < train.station.length && end > start ) {
			train.traveltime(start, end);
			break;
		
		}else {
			attempt ++;
					
		if(attempt == 1) {
			System.out.println("Please choose again");
			
		}else {
			System.out.println("Your request denied. Please contact the officer. ");
			}
					 
		}

	}
		sc.close();
		}
	
	
	public void platform2() {
		// TODO Auto-generated method stub
		
		platform2 train = new platform2();
	Scanner sc = new Scanner(System.in);
	int start,end;
	int attempt = 0;
		
		
		
	while (attempt < 2){
			
		System.out.println("Stations:");
		
	for(int i = 0; i < train.station.length; i++) {
		System.out.println(i + ": " + train.station[i]);
			
			}
		
	System.out.print("Enter the starting station (0 to 6):");
	start = sc.nextInt();
		
	System.out.print("Enter the ending station " + "(" + (start + 1) + " to 7):");
	end = sc.nextInt();
		
	
	//Fare Information
	 System.out.println("\n\nFare Information:");
	 Fare f = new Fare();
	 int baseFare = f.getFare(start, end);
    System.out.print("Base Fare: ฿" + baseFare);
    
	System.out.println("\n");
   //Apply Discount 
    DiscountCard card = new DiscountCard();
    card.displayDiscount(); // Shows type and rate
    double discountedFare = card.applyDiscount(baseFare);
    System.out.println("Discounted Fare: ฿" + discountedFare);
    
	System.out.println("\n");

  //Payment Process
    paymentProcess pp = new paymentProcess();
    pp.requiredFee=discountedFare;
    pp.payment();
    System.out.println("Here is your Token.");
	
	if (start >= 0 &&  end < train.station.length && end > start ) {
		train.travel(start, end);
		break;
	
	}else {
		attempt ++;
				
	if(attempt == 1) {
		System.out.println("Please choose again");
		
	}else {
		System.out.println("Your request denied. Please contact the officer. ");
		}
				 
	
	}
	

}
	sc.close();
	
	

}
	}


