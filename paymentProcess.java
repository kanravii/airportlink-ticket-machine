import java.util.Scanner;

public class paymentProcess {

	public double requiredFee = 0;
	
	public boolean payment() {
	
	Scanner sc = new Scanner(System.in);
	
	double totalPaid = 0.0;
	int attempts = 0;
	while ((attempts < 3) && (totalPaid < requiredFee) ) {
		double remainingFee = requiredFee -totalPaid;
		System.out.print("Please pay the registration fee (฿" + remainingFee + "remaining): ฿");
		double payment = sc.nextDouble();
		
		if (payment <= 0) {
			System.out.println(" Invalid Input. Please enter a positive amount");
			continue;	
		}
		totalPaid += payment;
		attempts++;
		
		if (totalPaid < requiredFee) {
			System.out.println("Still need ฿" + (requiredFee - totalPaid));
		}
	}
	
	if (totalPaid >= requiredFee) {
        if (totalPaid > requiredFee) {
            double change = totalPaid - requiredFee;
            System.out.println("Payment successful. Your change is ฿" + change);
        } else {
            System.out.println("Payment successful.");
        }
        return true;
    }
	if (attempts == 1) {
        System.out.println(" Still need ฿" + (requiredFee - totalPaid) + ". One more attempt allowed.");
    }

	 // If user fails after 2 tries
    System.out.println(" Payment failed after 2 attempts.");
    return false;
}
}

