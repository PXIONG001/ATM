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



    ArrayList<Date> user_birthdate = new ArrayList<>();


    ArrayList<Double> user_checking_balance = new ArrayList<>();
    ArrayList<Double> user_savings_balance = new ArrayList<>();

    boolean statement = false;

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

    //TODO #3 Modify the function for it to return index number 
    public int index_number(String username)
    {
        
        ArrayList<String> index_string = request_string("username");
        index_string.indexOf("Steven1");

        return 0;
    }

    //TODO #1 Modify the function for it to return boolean
    public boolean check_username(String username)
    {
        return statement;
    }

    //TODO #2 Modify the function for it to return boolean
    public boolean check_password(String password)
    {
        return statement;
    }

    public static void main(String[] args)
    {
        AccountController control = new AccountController();
        if (control.check_username("MJ"))
        {
            System.out.println("Welcome");
        }

        else
        {
            System.out.println("Blah!");
        }
    }
}
