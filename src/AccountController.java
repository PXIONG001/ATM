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

    ArrayList<Integer> user_id = new ArrayList<>();
    ArrayList<String> users_username = new ArrayList<>();
    ArrayList<String> user_password = new ArrayList<>();
    ArrayList<Date> user_birthdate = new ArrayList<>();
    ArrayList<String> user_first_name = new ArrayList<>();
    ArrayList<String> user_last_name = new ArrayList<>();
    ArrayList<Integer> user_social_security = new ArrayList<>();
    ArrayList<Integer> user_routing_number = new ArrayList<>();
    ArrayList<Integer> user_account_number = new ArrayList<>();
    ArrayList<Double> user_checking_balance = new ArrayList<>();
    ArrayList<Double> user_savings_balance = new ArrayList<>();

    /**
     * The function is access the information from database.
     */
    public void controller() 
    {

        // for-each loop to create the array list from the accounts. 
        for (Account obj : database.connect())
        {
            user_id.add(obj.getID());
            users_username.add(obj.getName());
            user_password.add(obj.getPassword());
            user_birthdate.add(obj.getBirthdate());
            user_first_name.add(obj.getFirstName());
            user_last_name.add(obj.getLastName());
            user_social_security.add(obj.getSocialSecurity());
            user_routing_number.add(obj.getRoutingNumber());
            user_account_number.add(obj.getAccountNumber());
            user_checking_balance.add(obj.getCheckingBalance());
            user_savings_balance.add(obj.getSavingsBalance());
        }
    }

    /**
     * This will be temporary. 
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}
