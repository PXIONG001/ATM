// Import ArrayList
import java.util.ArrayList;

// Import Date
import java.util.Date;

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

    /**
     * 
     * Returns the index number of the username in which it can 
     * define which user information is needed based on the index
     * number.
     * 
     * @param username the username
     * @return returns the index number from the username
     */
    public int index_number(String username)
    {
        // An array list of the username which will be to find the username's index number.
        ArrayList<String> index_string = request_string("username");

        // Where the username's index number is located.
        int where_the_index = index_string.indexOf(username);

        if (index_string.contains(username))
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
}