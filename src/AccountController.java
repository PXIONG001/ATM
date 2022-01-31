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
    public int index_number(String username)
    {
        // An array list of the username which will be to find the username's index number.
        ArrayList<String> index_int = request_string("username");

        // Where the username's index number is located.
        int where_the_index = index_int.indexOf(username);

        if (index_int.contains(username))
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
     * Fetches the account number from the user table.
     * 
     * @param username the username to find the account number that associates to it
     * @return returns the account number 
     */
    public int get_account_number(String username)
    {
        ArrayList<Integer> users_account_number = request_int("user's account number");
        int location = index_number(username);
        return users_account_number.get(location);
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

    public boolean check_checking(String username)
    {
        ArrayList<Integer> checking_account_number = request_int("checking account number");
        int user_account = get_account_number(username);

        if (checking_account_number.contains(user_account))
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }

    public boolean check_savings(String username)
    {
        ArrayList<Integer> savings_account_number = request_int("savings account number");
        int user_account = get_account_number(username);

        if (savings_account_number.contains(user_account))
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
}