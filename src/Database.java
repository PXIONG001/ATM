// Import ResultSet, Connection, DriverManager, and Statement.
import java.sql.*;

// Import ArrayList.
import java.util.ArrayList;
import java.util.Date;

// Import Wini
import org.ini4j.*;

// Import File
import java.io.File;

/**
 * Checking.java will display information on your checking
 * account and allow you to withdraw or deposit money.
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-12-09
 */
public class Database {

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
     * 
     * The main driver to connect to the user information. 
     * 
     * @param args Does not take any user input.
     * @throws Exception The exception catches if there is no class that exist, or no connection cannot be made.
     */
    public void connect() 
    {
        // try-catch
        // Tries to execute the code.
        try {
            // INI file to access sensitive information
            Wini ini = new Wini(new File("C:\\Users\\pengs\\.vscode\\Java-VSCode_Project\\ATM\\files\\my_INI_file.ini"));

            // Connection to the data base. 
            String url = ini.get("database", "url");
            // The username to the database.
            String username = ini.get("database", "username");
            // The password to the database.
            String password = ini.get("database", "password");

            // Connector/J
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connection to the database.
            Connection con = DriverManager.getConnection(url, username, password);
            // Statements to utilize SQL commands.
            Statement stmt = con.createStatement();
            // To execute the SQL commands.
            ResultSet rs = stmt.executeQuery("select * from owners;");
            ArrayList<Account> accounts = new ArrayList<>();
            
            // Loops through the database to get the information. 
            while (rs.next()) {
                // Set a new account class.
                Account user_account = new Account();
                // String variable to store information from the database.
                user_account.setID(rs.getInt("ID"));
                user_account.setName(rs.getString("Username"));
                user_account.setPassword(rs.getString("Password"));
                user_account.setBirthdate(rs.getDate("Birthdate"));
                user_account.setFirstName(rs.getString("First Name"));
                user_account.setLastName(rs.getString("Last Name"));
                user_account.setSocialSecurity(rs.getInt("Social Security"));
                user_account.setRoutingNumber(rs.getInt("Routing Number"));
                user_account.setAccountNumber(rs.getInt("Account Number"));
                user_account.setCheckingBalance(rs.getDouble("Checking Balance"));
                user_account.setSavingsBalance(rs.getDouble("Savings Balance"));

                accounts.add(user_account);
                
            }

            for (Account obj : accounts)
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

            System.out.println(user_checking_balance.get(1));

            // Closes the connection to the database.
            con.close();
        } 
        
        // Catches the Exception.
        catch (Exception e) {
            System.out.println(e);
        }

    }

}
