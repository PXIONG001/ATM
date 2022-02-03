// import Scanner, Date
import java.util.*;

/**
 * Checking.java will display information on your checking
 * account and allow you to withdraw or deposit money.
 * 
 * @author Pengshing Xiong
 * @version 2.0
 * @since 2021-12-09
 */
public class App extends AccountController
{

    /**
     * 
     * This function access the checking account.
     * 
     */
    public void checking(String username) 
    {
        Scanner checking_scanner = new Scanner(System.in);
        Boolean loop = true;

        System.out.println("\nWhat would you like to do today? Enter the number or type which type of account to access\n");
        System.out.println("(1) Deposit\n");
        System.out.println("(2) Withdraw\n");
        System.out.println("(3) See Balance\n");
        System.out.println("(4) Exit\n");
        
        String user_input = checking_scanner.nextLine();

        while (loop)
        {
            switch(user_input)
            {
                case "1":
                case "deposit":
                case "Deposit":
                    System.out.println("How much would you like to deposit in your account?\n");
                    double deposit_amount = checking_scanner.nextDouble();
                    deposit(username, "checking", deposit_amount);
                    break;
    
                case "2":
                case "withdraw":
                case "Withdraw":
                    System.out.println("How much would you like to deposit in your account?\n");
                    double withdraw_amount = checking_scanner.nextDouble();
                    withdraw(username, "checking", withdraw_amount);
                    break;
    
                case "3":
                case "see balance":
                case "See Balance":
                    see_balance(username, "checking");
                    break;
    
                case "4":
                case "exit":
                case "Exit":
                    loop = false;
                    break;
    
                default:
                    System.out.println("Please give an input on the following listed!\n");
                    break;
            }
        }

        checking_scanner.close();

    }
    
    /**
     * 
     * This function access the savings account.
     * 
     */
    public void savings(String username)
    {
        Scanner savings_scanner = new Scanner(System.in);
        Boolean loop = true;

        System.out.println("\nWhat would you like to do today? Enter the number or type which type of account to access\n");
        System.out.println("(1) Deposit\n");
        System.out.println("(2) Withdraw\n");
        System.out.println("(3) See Balance\n");
        System.out.println("(4) Exit\n");
        
        String user_input = savings_scanner.nextLine();

        while (loop)
        {
            switch(user_input)
            {
                case "1":
                case "deposit":
                case "Deposit":
                    System.out.println("How much would you like to deposit in your account?\n");
                    double deposit_amount = savings_scanner.nextDouble();
                    deposit(username, "checking", deposit_amount);
                    break;
    
                case "2":
                case "withdraw":
                case "Withdraw":
                    System.out.println("How much would you like to deposit in your account?\n");
                    double withdraw_amount = savings_scanner.nextDouble();
                    withdraw(username, "checking", withdraw_amount);
                    break;
    
                case "3":
                case "see balance":
                case "See Balance":
                    see_balance(username, "checking");
                    break;
    
                case "4":
                case "exit":
                case "Exit":
                    loop = false;
                    break;
    
                default:
                    System.out.println("Please give an input on the following listed!\n");
                    break;
            }
        }

        savings_scanner.close();
    }
    /**
     * This is the main method that will control the ATM/Banking system.
     * 
     * @param args Accept user input from the users with the scanner.
     */
    public static void main(String[] args) 
    {
        App application = new App();
        
        // Takes user input
        Scanner sc = new Scanner(System.in);   



        // This is the first implementation of the login. Later on, this will be modified to work with the database. 
        System.out.println("Enter your username and password! \n");

        String check_the_username = sc.nextLine();
        String check_the_password = sc.nextLine();

        if (application.check_username(check_the_username) && application.check_password(check_the_password))
        {
            if (application.check_checking(check_the_username) && application.check_savings(check_the_username))
            {
                System.out.println("\nWhich account would you like to access? Enter the number or type which type of account to access\n");
                // Temporary Error
                System.out.println("Savings does not work! Please use checking for testing.");
                System.out.println("(1) Checking\n");
                System.out.println("(2) Savings\n");
                String user_input = sc.next();

                switch(user_input)
                {
                    case "1":
                    case "checking":
                    case "Checking":
                        application.checking(check_the_username);
                        break;

                    case "2":
                    case "savings":
                    case "Savings":
                        application.savings(check_the_username);
                        break;
                }
            }

            else if (application.check_savings(check_the_username))
            {
                application.savings(check_the_username);
            }

            else
            {
                application.checking(check_the_username);
            }
        }

        else
        {
            System.out.println("Incorrect username or password");
        }

        sc.close();
    }
}