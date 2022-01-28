// Imports Date
import java.util.Date;

// imports ArrayList
import java.util.ArrayList;

/**
 * 
 * RequestController requests the data from the database, 
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2022-01-25
 */
public class RequestController extends Database {
    
    /**
     * 
     * Gets the array list of the strings
     * 
     * @return returns the specified array list from the table
     */
    public ArrayList<String> request_string(String request_which_list)
    {
        ArrayList<String> username = new ArrayList<>();
        ArrayList<String> customer_name = new ArrayList<>();
        ArrayList<String> password = new ArrayList<>();

        // Gets the array list of the username and password
        for (Account obj : connect_table_user())
        {
            username.add(obj.getUsername());
            password.add(obj.getPassword());
        }

        // Gets the array list of the customer name
        for (Account obj : connect_table_customer())
        {
            customer_name.add(obj.getCustomerName());
        }

        // Returns the array list of the username
        if (request_which_list.equals("username"))
        {
            return username;
        }

        // Returns the array list of the password
        else if (request_which_list.equals("password"))
        {
            return password;
        }

        // Returns the array list of the username
        else
        {
            return username;
        }
    }

    /**
     * 
     * Get the array list of the checking and savings balance from the database
     * 
     * @return returns an array list of the balance
     */
    public ArrayList<Double> request_double(String request_which_list)
    {
        ArrayList<Double> checking_balance = new ArrayList<>();
        ArrayList<Double> savings_balance = new ArrayList<>();

        // Get the array list of checking balnce from each user
        for (Account obj : connect_table_checking())
        {
            checking_balance.add(obj.getCheckingBalance());
        }

        // Get the array list of saving balance from each user
        for (Account obj : connect_table_savings())
        {
            savings_balance.add(obj.getSavingsBalance());
        }

        // Returns the array list of checking balance from each user
        if (request_which_list.equals("checking account"))
        {
            return checking_balance;
        }

        // Returns the array list of savings balance from each user
        else
        {
            return savings_balance;
        }
        
    }

    /**
     * 
     * Get the the integers from the database
     * 
     * @return returns the array list of which specified table
     */
    public ArrayList<Integer> request_int(String request_which_list)
    {
        ArrayList<Integer> user_id = new ArrayList<>();
        ArrayList<Integer> user_account_number = new ArrayList<>();

        ArrayList<Integer> check_account_number = new ArrayList<>();
        ArrayList<Integer> check_savings_number = new ArrayList<>();

        // Get the id number for the user
        for (Account obj : connect_table_user())
        {
            user_id.add(obj.getID());
            user_account_number.add(obj.getAccountNumber());
        }

        // Get the account number for the savings account
        for (Account obj : connect_table_savings())
        {
            check_savings_number.add(obj.getAccountNumber());
        }

        // Get the account number for the checking account
        for (Account obj : connect_table_checking())
        {
            check_account_number.add(obj.getAccountNumber());
        }

        // Returns the user id
        if (request_which_list.equals("user_id"))
        {
            return user_id;
        }

        else if (request_which_list.equals("user's account number"))
        {
            return user_account_number;
        }

        // Returns the checking account number
        else if (request_which_list.equals("checking account number"))
        {
            return check_account_number;
        }

        // Returns the savings account number
        else if (request_which_list.equals("savings account number"))
        {
            return check_savings_number;
        }

        else 
        {
            return null;
        }
    }

    /**
     * 
     * This function returns the birthdate of the users.
     * 
     * @return returns an array list of birthdates
     */
    public ArrayList<Date> request_date()
    {
        ArrayList<Date> birthdate = new ArrayList<>();

        for (Account obj : connect_table_customer())
        {
            birthdate.add(obj.getBirthdate());
        }

        return birthdate;
    }

    /**
     * 
     * This function updates the balance of the checking or savings account.
     * 
     * @param money the money that the user wants to deposit or withdraw from their account
     * @param type_of_account which account the user requested to be accessed
     * @param username_account the account number of the user for identification purposes.
     */
    public void updating_user_balance(double money, String type_of_account, int username_account)
    {
        update_balance_information(money, type_of_account, username_account);
    }
}
