// import Scanner
import java.util.*;

//TODO #IMPORTANT this class will be remodified to utilize the classes for efficently.
/**
 * Checking.java will display information on your checking
 * account and allow you to withdraw or deposit money.
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-12-09
 */
public class App 
{
    
    /**
     * This is the main method that will control the ATM/Banking system.
     * 
     * @param args Accept user input from the users with the scanner.
     */
    public static void main(String[] args) 
    {

        // User input variable used in nest swtch cases
        Integer user_input_for_account;

        // Withdraw variable used for Checking and Savings switch cases
        Double user_withdraw;
        Double withdraw;

        // Deposit variable used for Checking and Savings switch cases
        Double user_deposit;
        Double deposit;
        
        // Takes user input
        Scanner sc = new Scanner(System.in);   
        
        // Creates a new object with checking
        Checking checking = new Checking(43263.90);    

        // Creates a new object with savings
        Savings saving_total = new Savings(3023.01);

        // Variable is used for the first loop
        Boolean loop = true;

        //TODO #1
        // This is the first implementation of the login. Later on, this will be modified to work with the database. 
        System.out.println("Please enter your name to identify yourself! \n");
        
        System.out.println("Welcome " + sc.nextLine() + "! Which account would you like to access today?\n");

        // The first continous loop for the user
        while (loop) 
        {

            System.out.println("Checking\n\nSavings\n\nExit\n");
            String user_input = sc.next();

            // Switch case for accessing different accounts.
            switch (user_input) {

                // Checking
                case "1":
                case "checking":
                case "Checking":
                    Boolean checking_loop = true;
                    
                    // Nested loop. The nested continous loop keeps asking the users what they want to do
                    // until they input the command: Exit.
                    while (checking_loop) 
                    {
                        System.out.println("What would you like to do today?\n");
                        System.out.println("1. Withdraw\n\n2. Deposit\n\n3. See Balance\n\n4. Exit\n");
                        System.out.println("Type in the number:");
                    
                        user_input_for_account = sc.nextInt();

                        // Nest Switch case. The user gives an input on which action they would like to
                        // proceed in their checking account
                        switch (user_input_for_account) 
                        {
                            // Withdraw
                            case 1:
                                System.out.println("\nHow much would you like to withdraw?\n");
                                
                                user_withdraw = sc.nextDouble();
                                withdraw = checking.getCheckingBalance() - user_withdraw;
                                checking.setCheckingBalance(withdraw);
    
                                System.out.println("You have withdrawn " + user_withdraw + ". You now have " + checking.getCheckingBalance() + "\n");
                                
                                break;
                            
                            // Deposit
                            case 2:
                                System.out.println("\nHow much would you like to deposit?\n");
                                
                                user_deposit = sc.nextDouble();
                                deposit = checking.getCheckingBalance() + user_deposit;
                                checking.setCheckingBalance(deposit);
                            
                                System.out.println("You have deposited $" + user_deposit + ". You now have $" + checking.getCheckingBalance() + "\n");
    
                                break;
    
                            // See Balance
                            case 3:
                            
                                System.out.println("Balance: " + checking.getCheckingBalance() + "\n");
                                
                                break;

                            // Exit
                            case 4:
                                checking_loop = false;
                                break;
    
                            // Ask user to type in one of the following commands
                            default:
                                System.out.println("Invalid input! Please type in a number to proceed: \n");
                                break;
                        }
                            
                    }

                    break;
                
                // Savings
                case "2":
                case "savings":
                case "Savings":
                    Boolean savings_loop = true;
                    
                    // Nested loop. The nested continous loop keeps asking the users what they want to do
                    // until they input the command: Exit.
                    while (savings_loop) 
                    {
                        System.out.println("What would you like to do today?\n");
                        System.out.println("1. Withdraw\n\n2. Deposit\n\n3. See Balance\n\n4. Exit\n");
                        System.out.println("Type in the number:");
                    
                        user_input_for_account = sc.nextInt();

                        // Nest Switch case. The user gives an input on which action they would like to
                        // proceed in their savings account
                        switch (user_input_for_account) 
                        {
                            // Withdraw
                            case 1:
                                System.out.println("\nHow much would you like to withdraw?\n");
                                
                                user_withdraw = sc.nextDouble();
                                withdraw = saving_total.getSavingsBalance() - user_withdraw;
                                saving_total.setSavingsBalance(withdraw);
    
                                System.out.println("You have withdrawn " + user_withdraw + ". You now have " + saving_total.getSavingsBalance() + "\n");
                                
                                break;
    
                            // Deposit
                            case 2:
                                System.out.println("\nHow much would you like to deposit?\n");
                                
                                user_deposit = sc.nextDouble();
                                deposit = saving_total.getSavingsBalance() + user_deposit;
                                saving_total.setSavingsBalance(deposit);
                            
                                System.out.println("You have deposited $" + user_deposit + ". You now have $" + saving_total.getSavingsBalance() + "\n");
    
                                break;
    
                            // See Balance
                            case 3:
                            
                                System.out.println("Balance: " + saving_total.getSavingsBalance() + "\n");
                                
                                break;

                            // Exit
                            case 4:
                                savings_loop = false;
                                break;
    
                            // Ask user to type in one of the following commands
                            default:
                            System.out.println("Invalid input! Please type in a number to proceed: \n");
                                break;
                        }
                            
                    }

                    break;
                
                // Exit
                case "3":
                case "exit":
                case "Exit":
                    loop = false;
                    break;

                // If the user does not type in any of the inputs
                default:
                    System.out.println("Invalid input! Please type in the following input: ");
                    break;
            }

        }

        // Closes the scanner
        sc.close();
    }
}
