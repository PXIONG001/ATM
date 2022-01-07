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
public class AccountController {

    // Database variable
    Database database = new Database();

    // Array list for user's birthdate
    ArrayList<Date> user_birthdate = new ArrayList<>();

    // Array list for user's checking balance
    ArrayList<Double> user_checking_balance = new ArrayList<>();

    // Array list for user's saving's balance
    ArrayList<Double> user_savings_balance = new ArrayList<>();

    // Boolean for login
    boolean statement = false;

    /**
     * 
     * The function gives back a string array list
     * 
     * @param request_list it is requesting which list to give back
     * @return returns a string array list
     */
    public ArrayList<String> request_string(String request_list)
    {
        ArrayList<String> user_username = new ArrayList<>();
        ArrayList<String> user_password = new ArrayList<>();
        ArrayList<String> user_first_name = new ArrayList<>();
        ArrayList<String> user_last_name = new ArrayList<>();
          // for-each loop to create the array list from the accounts. 
          for (Account obj : database.connect())
          {
              user_username.add(obj.getUsername());
              user_password.add(obj.getPassword());
              user_first_name.add(obj.getFirstName());
              user_last_name.add(obj.getLastName());
          }      

          if (request_list.equals("username"))
          {
              return user_username;
          }

          else if (request_list.equals("password"))
          {
              return user_password;
          }

          else if (request_list.equals("first name"))
          {
              return user_first_name;
          }

          else 
          {
            return user_last_name;
          }
    }

    /**
     * 
     * The function returns an integer array list
     * 
     * @param request_list which list to get
     * @return returns an integer array list
     */
    public ArrayList<Integer> request_int(String request_list)
    {
        ArrayList<Integer> user_id = new ArrayList<>();
        ArrayList<Integer> user_social_security = new ArrayList<>();
        ArrayList<Integer> user_routing_number = new ArrayList<>();
        ArrayList<Integer> user_account_number = new ArrayList<>();
          // for-each loop to create the array list from the accounts. 
          for (Account obj : database.connect())
          {
              user_id.add(obj.getID());
              user_social_security.add(obj.getSocialSecurity());
              user_routing_number.add(obj.getRoutingNumber());
              user_account_number.add(obj.getAccountNumber());
          }      

          if (request_list.equals("id"))
          {
              return user_id;
          }

          else if (request_list.equals("social security"))
          {
              return user_social_security;
          }

          else if (request_list.equals("routing number"))
          {
              return user_routing_number;
          }

          else 
          {
            return user_account_number;
          }
    }

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

        if (where_the_index == 0 || where_the_index == null)
        {
            return 0;
        }

        else
        {
            return where_the_index;
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

        for (int i = 0; i <= the_users.size() - 1; i++)
        {
            if (username.equals(the_users.get(i)))
            {
                statement = true;
            }

            else
            {
                statement = false;
            }
        }

        return statement;
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
        ArrayList<String> the_users = request_string("password");

        for (int i = 0; i <= the_users.size() - 1; i++)
        {
            if (password.equals(the_users.get(i)))
            {
                statement = true; 
            }

            else
            {
                statement = false;
            }
        }

        return statement;
    }
}
