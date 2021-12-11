import java.util.*;

/**
 * Checking.java will display information on your checking
 * account and allow you to withdraw or deposit money.
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-12-09
 */
public class App {
    
    /**
     * This is the main method that will control the ATM/Banking system.
     * 
     * @param args Accept user input from the users with the scanner.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name to identify yourself! \n");
        
        System.out.println("Welcome " + sc.nextLine() + "! Which account would you like to access today?\n");

        System.out.println("Checking\n\nSavings\n");
        
        String user_input = sc.nextLine();

        switch (user_input) {
            
            case "Checking":
                Checking checking = new Checking(43263.90);

                System.out.println("What would you like to do today?\n");
                System.out.println("1. Withdraw\n\n2. Deposit\n\n3. See Balance\n");
                System.out.println("Type in the number:");
                
                String user_input_for_checking = sc.nextLine();
                
                switch (user_input_for_checking) {
                    case "Withdraw":
                    
                        System.out.println("Bitch!");
                        
                        break;

                    case "Deposit":
                    
                        System.out.println("Bitch!");
                        
                        break;

                    case "See Balance":
                    
                        System.out.println("Balance: " + checking.getCheckingBalance());
                        
                        break;
                }

                break;

            case "Savings":
                Savings saving_total = new Savings(3023.01);
            
                System.out.println("What would you like to do today?\n");
                System.out.println("1. Withdraw\n\n2. Deposit\n\n3. See Balance\n");
                System.out.println("Type in the number:");
            
                String user_input_for_savings = sc.nextLine();
            
                switch (user_input_for_savings) {
                    case "Withdraw":
                        System.out.println("\nHow much would you like to withdraw?\n");
                         
                        Double user_withdraw = sc.nextDouble();
                        Double withdraw = saving_total.getSavingsBalance() - user_withdraw;
                        saving_total.setSavingsBalance(withdraw);

                        System.out.println("You have withdrawn " + withdraw + ". You now have " + saving_total.getSavingsBalance());
                        
                        break;

                    case "Deposit":
                        System.out.println("\nHow much would you like to deposit?\n");
                    
                        System.out.println("You have deposited ");
                        
                        break;

                    case "See Balance":
                    
                        System.out.println("Balance: " + saving_total.getSavingsBalance());
                        
                        break;

                    default:
                        System.out.println("Don't fucking waste my time!");
                        break;
                }

                break;

            default:
                System.out.println("So much for fucking wasting my time!");
                break;
        }

        sc.close();
    }
}
