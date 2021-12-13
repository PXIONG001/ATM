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

        Integer user_input_for_account;
        Double user_withdraw;
        Double withdraw;
        Double user_deposit;
        Double deposit;
        
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

                case "1":
                case "checking":
                case "Checking":
                    Boolean checking_loop = true;
                    
                    while (checking_loop) 
                    {
                        System.out.println("What would you like to do today?\n");
                        System.out.println("1. Withdraw\n\n2. Deposit\n\n3. See Balance\n\n4. Exit\n");
                        System.out.println("Type in the number:");
                    
                        user_input_for_account = sc.nextInt();

                        switch (user_input_for_account) 
                        {
                            case 1:
                                System.out.println("\nHow much would you like to withdraw?\n");
                                
                                user_withdraw = sc.nextDouble();
                                withdraw = checking.getCheckingBalance() - user_withdraw;
                                checking.setCheckingBalance(withdraw);
    
                                System.out.println("You have withdrawn " + user_withdraw + ". You now have " + checking.getCheckingBalance() + "\n");
                                
                                break;
    
                            case 2:
                                System.out.println("\nHow much would you like to deposit?\n");
                                
                                user_deposit = sc.nextDouble();
                                deposit = checking.getCheckingBalance() + user_deposit;
                                checking.setCheckingBalance(deposit);
                            
                                System.out.println("You have deposited $" + user_deposit + ". You now have $" + checking.getCheckingBalance() + "\n");
    
                                break;
    
                            case 3:
                            
                                System.out.println("Balance: " + checking.getCheckingBalance() + "\n");
                                
                                break;

                            case 4:
                                checking_loop = false;
                                break;
    
                            default:
                                System.out.println("Invalid input! Please type in a number to proceed: \n");
                                break;
                        }
                            
                    }

                    break;
                
                case "2":
                case "savings":
                case "Savings":
                    Boolean savings_loop = true;
                    
                    while (savings_loop) 
                    {
                        System.out.println("What would you like to do today?\n");
                        System.out.println("1. Withdraw\n\n2. Deposit\n\n3. See Balance\n\n4. Exit\n");
                        System.out.println("Type in the number:");
                    
                        user_input_for_account = sc.nextInt();

                        switch (user_input_for_account) 
                        {
                            case 1:
                                System.out.println("\nHow much would you like to withdraw?\n");
                                
                                user_withdraw = sc.nextDouble();
                                withdraw = saving_total.getSavingsBalance() - user_withdraw;
                                saving_total.setSavingsBalance(withdraw);
    
                                System.out.println("You have withdrawn " + user_withdraw + ". You now have " + saving_total.getSavingsBalance() + "\n");
                                
                                break;
    
                            case 2:
                                System.out.println("\nHow much would you like to deposit?\n");
                                
                                user_deposit = sc.nextDouble();
                                deposit = saving_total.getSavingsBalance() + user_deposit;
                                saving_total.setSavingsBalance(deposit);
                            
                                System.out.println("You have deposited $" + user_deposit + ". You now have $" + saving_total.getSavingsBalance() + "\n");
    
                                break;
    
                            case 3:
                            
                                System.out.println("Balance: " + saving_total.getSavingsBalance() + "\n");
                                
                                break;

                            case 4:
                                savings_loop = false;
                                break;
    
                            default:
                            System.out.println("Invalid input! Please type in a number to proceed: \n");
                                break;
                        }
                            
                    }

                    break;

                case "3":
                case "exit":
                case "Exit":
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid input! Please type in the following input: ");
                    break;
            }

        }

        sc.close();
    }
}
