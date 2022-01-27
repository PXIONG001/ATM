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
     * 
     */
    public void checking() 
    {

    }
    
    /**
     * 
     * 
     */
    public void savings()
    {

    }
    /**
     * This is the main method that will control the ATM/Banking system.
     * 
     * @param args Accept user input from the users with the scanner.
     */
    public static void main(String[] args) 
    {
        App application = new App();

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
                        
        }

        else
        {
            System.out.println("Incorrect username or password");
        }

        sc.close();
    }
}