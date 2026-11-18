import java.util.Scanner;

import javax.swing.JOptionPane;

public class AirportlinkMain {

	    	
	public static void main(String[] args) {
        String[] options = {"Top Up", "Create Card", "Buy Ticket"};
        
        int choice = JOptionPane.showOptionDialog(
            null,
            "Sawatdee Khrab Choose an option:",
            "Airport Link Clerk",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            options[0] // default selected
        );

        switch (choice) {
            case 0:
                // Top Up
                JOptionPane.showMessageDialog(null, "Top Up selected.");
                topUp tu = new topUp();
                
                tu.processtopUp();
                System.out.println("\n\n      Thank you for using our services!");
                break;

            case 1:
                // Create Card
                JOptionPane.showMessageDialog(null, "Create Card selected.");
               
                CreateCard cc = new CreateCard();
                cc.callCreateCard();
                
                break;

            case 2:
                // Buy Ticket
                JOptionPane.showMessageDialog(null, "Buy Ticket selected.");
              
                buyTicket bt = new buyTicket();
                Scanner sc = new Scanner(System.in);
                System.out.println("===========Choose a Platform==========");
                System.out.println("Platform 1: Heading to Suvarnabhumi ");
                System.out.println("Platform 2: Heading to Phayathai");
                System.out.print("Enter 1 or 2: ");
                int platform = sc.nextInt();
                if (platform == 1) {
                	bt.platform1();
                } else if (platform==2) {
                	bt.platform2();
                } else {
                	System.out.println("Invalid Input.");
                }
                System.out.println("\n\n      Thank you for using our services!");
                break;

            default:
                JOptionPane.showMessageDialog(null, "No option selected. Program will exit.");
                break;
        }
    }
	    	
	       
	    	
	    	
	    	
	    
	}
