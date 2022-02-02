// Import ArrayList
import java.util.ArrayList;

/**
 * AccountController.java is the controller.
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
     * The deposit function allows the user to deposit from which 
     * account they want to deposit.
     * 
     */
    public void deposit(String username, String account_type, double deposit_amount)
    {
        Calculations calculate = new Calculations();
        Database database = new Database();

        switch(account_type)
        {
            case "checking":
                ArrayList<Double> checking = request_double("checking account");
                ArrayList<Integer> checking_account = request_int("checking account number");
                int get_checing_account_number = get_account_number(username);
                int index_of_checking_account = checking_account.indexOf(get_checing_account_number);
                database.update_balance_information(calculate.depsoit_calculations(deposit_amount, checking.get(index_of_checking_account)), "checking account", get_checing_account_number);


            case "savings":
                ArrayList<Double> savings = request_double("savings account");
                ArrayList<Integer> savings_account = request_int("savings account number");
                int get_savings_account_number = get_account_number(username);
                int index_of_savings_account = savings_account.indexOf(get_savings_account_number);
                database.update_balance_information(calculate.depsoit_calculations(deposit_amount, savings.get(index_of_savings_account)), "savings account", get_savings_account_number);

        }       
    }

    /**
     * 
     * The withdraw function allows the user to withdraw money from which
     * account they want to withdraw.
     * 
     */
    public void withdraw(String username, String account_type, double deposit_amount)
    {
        Calculations calculate = new Calculations();
        Database database = new Database();

        switch(account_type)
        {
            case "checking":
                ArrayList<Double> checking = request_double("checking account");
                ArrayList<Integer> checking_account = request_int("checking account number");
                int get_checing_account_number = get_account_number(username);
                int index_of_checking_account = checking_account.indexOf(get_checing_account_number);
                database.update_balance_information(calculate.depsoit_calculations(deposit_amount, checking.get(index_of_checking_account)), "checking account", get_checing_account_number);


            case "savings":
                ArrayList<Double> savings = request_double("savings account");
                ArrayList<Integer> savings_account = request_int("savings account number");
                int get_savings_account_number = get_account_number(username);
                int index_of_savings_account = savings_account.indexOf(get_savings_account_number);
                database.update_balance_information(calculate.depsoit_calculations(deposit_amount, savings.get(index_of_savings_account)), "savings account", get_savings_account_number);

        }       
    }

    /**
     * 
     * The see_balance function shows the balance of which account the 
     * users choose.
     * 
     */
    public void see_balance()
    {
        ArrayList<Double> checking = request_double("checking account");
        ArrayList<Double> savings = request_double("savings account");
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