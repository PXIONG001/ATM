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
        ArrayList<String> requested = new ArrayList<>();
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

          switch(request_list)
          {
            case "username":
                requested = user_username;
                break;

            case "password":
                requested =  user_password;
                break;
                
            case "first name":
                requested = user_first_name;
                break;

            case "last name":
                requested = user_last_name;
                break;

            default:
                break;
          }

          return requested;
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
        ArrayList<Integer> requested = new ArrayList<>();
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

          switch(request_list)
          {
            case "id":
                for (int i = 0; i < user_id.size(); i ++)
                {
                    System.out.println(user_id.get(i));
                }
                requested = user_id;
                break;

            case "password":
                requested =  user_social_security;
                break;
                
            case "first name":
                requested = user_routing_number;
                break;

            case "last name":
                requested = user_account_number;
                break;

            default:
                break;
          }

          return requested;
    }

    /**
     * 
     * The function returns an array list for the checking and saving's account
     * 
     * @param request_list the name of which array list to obtain
     * @return returns the requested array list.
     */
    public ArrayList<Double> request_double(String request_list)
    {
        ArrayList<Double> requested = new ArrayList<>();
        ArrayList<Double> checking_balance = new ArrayList<>();
        ArrayList<Double> savings_balance = new ArrayList<>();

          // for-each loop to create the array list from the accounts. 
          for (Account obj : database.connect())
          {
              checking_balance.add(obj.getCheckingBalance());
              savings_balance.add(obj.getSavingsBalance());
          }      


        switch(request_list)
        {
            case "checking account":
                requested = checking_balance;
                break;

            case "savings account":
                requested = savings_balance;
                break;

            default:
                break;
        }

        return requested;
    }

    /**
     *
     * The function returns an array list of dates.
     * 
     * @return Returns an arraylist of dates.
     */
    public ArrayList<Date> request_date()
    {
        ArrayList<Date> date = new ArrayList<>();

        for (Account obj : database.connect())
        {
            date.add(obj.getBirthdate());
        }

        return date;
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

        if (index_string.contains(username))
        {
            return where_the_index;
        }

        else
        {
            return 0;
        }
        
    }

    public void updating_user_balance(double money, String type_of_account, String username_account)
    {
        database.update_balance_information(money, type_of_account, username_account);
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
