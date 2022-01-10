// import Scanner, Date
import java.util.*;

/**
 * Checking.java will display information on your checking
 * account and allow you to withdraw or deposit money.
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-12-09
 */
public class App extends AccountController
{
    
    /**
     * This is the main method that will control the ATM/Banking system.
     * 
     * @param args Accept user input from the users with the scanner.
     */
    public static void main(String[] args) 
    {
        App application = new App();

        // The array list variables for the strings
        ArrayList<String> first_name = application.request_string("first name");
        ArrayList<String> last_name = application.request_string("last name");

        // The array list variables for the integers
        ArrayList<Integer> id = application.request_int("id");
        ArrayList<Integer> social_security = application.request_int("social security");
        ArrayList<Integer> routing_number = application.request_int("routing number");
        ArrayList<Integer> account_number = application.request_int("account number");

        // The array list variables for the doubles
        ArrayList<Double> checking_account = application.request_double("checking account");
        ArrayList<Double> savings_account = application.request_double("savings account");

        // The array list variable for the dates
        ArrayList<Date> date = application.request_date();

        // User input variable used in nest swtch cases
        String user_input_for_account;
        
        // Takes user input
        Scanner sc = new Scanner(System.in);   

        // Variable is used for the first loop
        Boolean loop = true;

        // This is the first implementation of the login. Later on, this will be modified to work with the database. 
        System.out.println("Enter your username and password! \n");

        String check_the_username = sc.nextLine();
        String check_the_password = sc.nextLine();

        if (application.check_username(check_the_username) && application.check_password(check_the_password))
        {
            System.out.println("Welcome " + first_name.get(application.index_number(check_the_username)) + " What would you like to do today?\n");
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
                        
                            user_input_for_account = sc.next();

                            // Nest Switch case. The user gives an input on which action they would like to
                            // proceed in their checking account
                            switch (user_input_for_account) 
                            {
                                
                                // Withdraw
                                case "1":
                                    double withdraw_checking_balance = checking_account.get(application.index_number(check_the_username));
                                    System.out.println("How much would you like to take out from your account?\n");
                                    double withdraw_amount = sc.nextDouble();
                                    double withdraw = withdraw_checking_balance - withdraw_amount;
                                    System.out.println("You have withdrawn $" + withdraw + " from your checking account.");
                                    checking_account.set(application.index_number(check_the_username), withdraw);
                                    break;
                                
                                // Deposit
                                case "2":
                                    double deposit_checking_balance = checking_account.get(application.index_number(check_the_username));
                                    System.out.println("How much would you like to put in your account?\n");
                                    double deposit_amount = sc.nextDouble();
                                    double deposit = deposit_checking_balance - deposit_amount;
                                    System.out.println("You have deposited $" + deposit + " from your checking account.");
                                    savings_account.set(application.index_number(check_the_username), deposit);
                                    break;
        
                                // See Balance
                                case "3":
                                    double checking_balance = checking_account.get(application.index_number(check_the_username));
                                    System.out.println("You have $" + checking_balance + " in your checking account.");
                                    break;

                                // Exit
                                case "4":
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
                        
                            user_input_for_account = sc.next();

                            // Nest Switch case. The user gives an input on which action they would like to
                            // proceed in their savings account
                            switch (user_input_for_account) 
                            {
                                // Withdraw
                                case "1":
                                    
                                    break;
        
                                // Deposit
                                case "2":
        
                                    break;
        
                                // See Balance
                                case "3":
                                    
                                    break;

                                // Exit
                                case "4":
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

        else
        {
            System.out.println("Incorrect username or password");
        }
    }
}
