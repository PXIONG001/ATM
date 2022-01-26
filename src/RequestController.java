import java.util.Date;
import java.util.ArrayList;

/**
 * 
 * 
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2022-01-25
 */
public class RequestController extends Database {
    
    /**
     * 
     * 
     * 
     * @return
     */
    public ArrayList<String> request_string(String list)
    {
        ArrayList<String> username = new ArrayList<>();
        ArrayList<String> customer_name = new ArrayList<>();
        ArrayList<String> password = new ArrayList<>();

        for (Account obj : connect_table_user())
        {
            username.add(obj.getUsername());
            password.add(obj.getPassword());
        }

        for (Account obj : connect_table_customer())
        {
            customer_name.add(obj.getCustomerName());
        }

        return username;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Double> request_double()
    {
        ArrayList<Double> checking_balance = new ArrayList<>();
        ArrayList<Double> savings_balance = new ArrayList<>();

        for (Account obj : connect_table_checking())
        {
            checking_balance.add(obj.getCheckingBalance());
        }

        for (Account obj : connect_table_savings())
        {
            savings_balance.add(obj.getSavingsBalance());
        }

        return checking_balance;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Integer> request_int()
    {
        ArrayList<Integer> user_id = new ArrayList<>();
        ArrayList<Integer> social_security = new ArrayList<>();
        ArrayList<Integer> routing_number = new ArrayList<>();
        ArrayList<Integer> account_number = new ArrayList<>();

        for (Account obj : connect_table_user())
        {
            user_id.add(obj.getID());
            routing_number.add(obj.getRoutingNumber());
            account_number.add(obj.getAccountNumber());
        }

        for (Account obj : connect_table_customer())
        {
            social_security.add(obj.getSocialSecurity());
        }

        return account_number;
    }

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
     * @param money
     * @param type_of_account
     * @param username_account
     */
    public void updating_user_balance(double money, String type_of_account, int username_account)
    {
        update_balance_information(money, type_of_account, username_account);
    }
}
