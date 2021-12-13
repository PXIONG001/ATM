import java.util.*;

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
        
        Scanner sc = new Scanner(System.in);    
        Checking checking = new Checking(43263.90);    
        Savings saving_total = new Savings(3023.01);
        Boolean loop = true;

        

        System.out.println("Please enter your name to identify yourself! \n");
        
        System.out.println("Welcome " + sc.nextLine() + "! Which account would you like to access today?\n");

        while (loop) 
        {

            System.out.println("Checking\n\nSavings\n\nExit\n");
            String user_input = sc.next();

            switch (user_input) {

                case "Checking":
                    Boolean loop_1 = true;
                    
                    while (loop_1) 
                    {
                        System.out.println("What would you like to do today?\n");
                        System.out.println("1. Withdraw\n\n2. Deposit\n\n3. See Balance\n\n4. Exit\n");
                        System.out.println("Type in the number:");
                    
                        Integer user_input_for_savings = sc.nextInt();

                        switch (user_input_for_savings) 
                        {
                            case 1:
                                System.out.println("\nHow much would you like to withdraw?\n");
                                
                                Double user_withdraw = sc.nextDouble();
                                Double withdraw = checking.getCheckingBalance() - user_withdraw;
                                saving_total.setSavingsBalance(withdraw);
    
                                System.out.println("You have withdrawn " + user_withdraw + ". You now have " + checking.getCheckingBalance());
                                
                                break;
    
                            case 2:
                                System.out.println("\nHow much would you like to deposit?\n");
                                
                                Double user_deposit = sc.nextDouble();
                                Double deposit = saving_total.getSavingsBalance() + user_deposit;
                                saving_total.setSavingsBalance(deposit);
                            
                                System.out.println("You have deposited $" + user_deposit + ". You now have $" + saving_total.getSavingsBalance());
    
                                break;
    
                            case 3:
                            
                                System.out.println("Balance: " + checking.getCheckingBalance());
                                
                                break;

                            case 4:
                                loop_1 = false;
                                break;
    
                            default:
                                System.out.println("Don't fucking waste my time!");
                                break;
                        }
                            
                    }

                    break;
        
                case "Savings":
                    Boolean loop_2 = true;
                    
                    while (loop_2) 
                    {
                        System.out.println("What would you like to do today?\n");
                        System.out.println("1. Withdraw\n\n2. Deposit\n\n3. See Balance\n\nExit\n");
                        System.out.println("Type in the number:");
                    
                        Integer user_input_for_savings = sc.nextInt();

                        switch (user_input_for_savings) 
                        {
                            case 1:
                                System.out.println("\nHow much would you like to withdraw?\n");
                                
                                Double user_withdraw = sc.nextDouble();
                                Double withdraw = saving_total.getSavingsBalance() - user_withdraw;
                                saving_total.setSavingsBalance(withdraw);
    
                                System.out.println("You have withdrawn " + user_withdraw + ". You now have " + saving_total.getSavingsBalance());
                                
                                break;
    
                            case 2:
                                System.out.println("\nHow much would you like to deposit?\n");
                                
                                Double user_deposit = sc.nextDouble();
                                Double deposit = saving_total.getSavingsBalance() + user_deposit;
                                saving_total.setSavingsBalance(deposit);
                            
                                System.out.println("You have deposited $" + user_deposit + ". You now have $" + saving_total.getSavingsBalance());
    
                                break;
    
                            case 3:
                            
                                System.out.println("Balance: " + saving_total.getSavingsBalance());
                                
                                break;

                            case 4:
                                loop_2 = false;
                                break;
    
                            default:
                                System.out.println("Don't fucking waste my time!");
                                break;
                        }
                            
                    }

                    break;

                case "Exit":
                    loop = false;
                    break;

                default:
                    System.out.println("Check problem above!");
                    break;
            }

        }

        sc.close();
    }
}
