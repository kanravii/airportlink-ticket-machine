import java.util.Scanner;
public class DiscountCard {
	
	Scanner sc= new Scanner(System.in);
	
	    public String type;
	    public double rate;
	    public int fare;

	    // Constructor to initialise card type and set the discount rate
	    public DiscountCard() {
	    	System.out.print("\nEnter Card Type (Normal / Senior / Student): ");	    	
	    	String type = sc.next();
	        this.type = type;
	        setRateByCardType(type);
	    }

	    // Public method to set discount rate based on card type
	    public void setRateByCardType(String type) {
	        switch (type.toLowerCase()) 
	        {
	            case "student":
	                this.rate = 0.2;
	                break;
	            case "senior":
	                this.rate = 0.5;
	                break;
	            default:
	                this.rate = 0.0;
	        }
	    }

	    // Method to apply discount to the fare
	    public double applyDiscount(int fare) {
	    	
	        return fare - (fare * rate);
	    }

	    // Method to display discount card details
	    public void displayDiscount() {
	        System.out.println("Card type: " + type);
	        System.out.println("Discount rate: " + (rate * 100) + "%");
	    }
	
}