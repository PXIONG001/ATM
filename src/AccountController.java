// Import ArrayList
import java.util.ArrayList;

/**
 * Account.java is the class for the account. 
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-12-14
 */
public class AccountController extends RequestController {

    // Boolean for login
    boolean statement = false;

    public void deposit()
    {
        
    }

    public void withdraw()
    {
        
    }

    public void see_balance()
    {
        
    }

    /**
     * 
     * Returns the index number of the account number in which it can 
     * define which user information is needed based on the index
     * number.
     * 
     * @param username the username
     * @return returns the index number from the username
     */
    public int index_number(int account_number)
    {
        // An array list of the username which will be to find the username's index number.
        ArrayList<Integer> index_int = request_int("user's account number");

        // Where the username's index number is located.
        int where_the_index = index_int.indexOf(account_number);

        if (index_int.contains(account_number))
        {
            return where_the_index;
        }

        else
        {
            return 0;
        }
        
    }

    /**
     * 
     * Checks if the username is correct
     * 
     * @param username the username
     * @return returns a boolean (true or false)
     */
    public boolean check_username(String username)
    {
        ArrayList<String> the_users = request_string("username");

        if (the_users.contains(username))
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    /**
     * 
     * Checks if the password is correct
     * 
     * @param password the password
     * @return returns a boolean (true or false)
     */
    public boolean check_password(String password)
    {
        ArrayList<String> the_passwords = request_string("password");

        if (the_passwords.contains(password))
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public boolean check_checking()
    {
        ArrayList<Integer> user_account_number = request_int("user's account number");
        ArrayList<Integer> checking_account_number = request_int("checking account number");

        if (user_account_number.get(index_number(0)) == checking_account_number.get(0))
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }

    public boolean check_savings()
    {
        ArrayList<Integer> user_account_number = request_int("user's account number");
        ArrayList<Integer> saving_account_number = request_int("savings account number");
        return false;
    }
}