// Import ResultSet, Connection, DriverManager, PreparedStatement and Statement.
import java.sql.*;

// Import ArrayList.
import java.util.ArrayList;

// Import Wini
import org.ini4j.*;

// Import File
import java.io.File;

/**
 * Checking.java will display information on your checking
 * account and allow you to withdraw or deposit money.
 * 
 * @author Pengshing Xiong
 * @version 2.0
 * @since 2021-12-09
 */
public class Database {
    
    /**
     * 
     * The function returns an array list of the customer information.
     * 
     * @return returns the array list of the customer information.
     */
    public ArrayList<Account> connect_table_customer() 
    {
        ArrayList<Account> accounts = new ArrayList<>();
        
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
            ResultSet rs = stmt.executeQuery("select * from table_customer;");

            // Loops through the database to get the information. 
            while (rs.next()) {
                // Set a new account class.
                Account user_account = new Account();
                // String variable to store information from the database.
                user_account.setID(rs.getInt("id"));
                user_account.setCustomerName(rs.getString("customer_name"));
                user_account.setBirthdate(rs.getDate("birthdate"));
                user_account.setSocialSecurity(rs.getInt("social_security"));
                accounts.add(user_account);
                
            }

            // Closes the connection to the database.
            con.close();
        } 
        
        // Catches the Exception.
        catch (Exception e) {
            System.out.println(e);
        }

        return accounts;
    }

    /**
     * 
     * The function returns an array list of the customer information.
     * 
     * @return returns the array list of the user account information.
     */
    public ArrayList<Account> connect_table_user() 
    {
        ArrayList<Account> accounts = new ArrayList<>();
        
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
            ResultSet rs = stmt.executeQuery("select * from table_users;");

            // Loops through the database to get the information. 
            while (rs.next()) {
                // Set a new account class.
                Account user_account = new Account();
                // String variable to store information from the database.
                user_account.setID(rs.getInt("id"));
                user_account.setUsername(rs.getString("username"));
                user_account.setPassword(rs.getString("password"));
                user_account.setRoutingNumber(rs.getInt("routing_number"));
                user_account.setAccountNumber(rs.getInt("account_number"));
                accounts.add(user_account);
                
            }

            // Closes the connection to the database.
            con.close();
        } 
        
        // Catches the Exception.
        catch (Exception e) {
            System.out.println(e);
        }

        return accounts;
    }

    /**
     * 
     * The function returns an array list of the customer information.
     * 
     * @return returns the array list of the savings information.
     */
    public ArrayList<Account> connect_table_savings() 
    {
        ArrayList<Account> accounts = new ArrayList<>();
        
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
            ResultSet rs = stmt.executeQuery("select * from table_savings;");

            // Loops through the database to get the information. 
            while (rs.next()) {
                // Set a new account class.
                Account user_account = new Account();
                // String variable to store information from the database.
                user_account.setAccountNumber(rs.getInt("account_number"));
                user_account.setSavingsBalance(rs.getDouble("savings_balance"));
                accounts.add(user_account);
                
            }

            // Closes the connection to the database.
            con.close();
        } 
        
        // Catches the Exception.
        catch (Exception e) {
            System.out.println(e);
        }

        return accounts;
    }

    /**
     * 
     * The function returns an array list of the customer information.
     * 
     * @return returns the array list of the checking information.
     */
    public ArrayList<Account> connect_table_checking() 
    {
        ArrayList<Account> accounts = new ArrayList<>();
        
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
            ResultSet rs = stmt.executeQuery("select * from table_checking;");

            // Loops through the database to get the information. 
            while (rs.next()) {
                // Set a new account class.
                Account user_account = new Account();
                // String variable to store information from the database.
                user_account.setAccountNumber(rs.getInt("account_number"));
                user_account.setCheckingBalance(rs.getDouble("checking_balance"));
                accounts.add(user_account);
            }

            // Closes the connection to the database.
            con.close();
        } 
        
        // Catches the Exception.
        catch (Exception e) {
            System.out.println(e);
        }

        return accounts;
    }

    /**
     * 
     * This function updates the balance of the user's checking or savings account.
     * 
     * @param money the money that has been changed.
     * @param type_of_acccout if the account is checking or savings.
     * @param username_accout the username to access the user's information.
     */
    public void update_balance_information(double money, String type_of_account, int account_number)
    {
        try 
        {
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

            // Switch case for which account to put the new balance in
            switch(type_of_account)
            {
                case "checking account":
                    // SQL Update statement
                    String query = "update table_checking set checking_balance=? where account_number=?";

                    // SQL Prepared Statements
                    PreparedStatement prepareStmt = con.prepareStatement(query);
                    prepareStmt.setDouble(1, money);
                    prepareStmt.setInt(2, account_number);
                    

                    // To execute the SQL commands.
                    prepareStmt.executeUpdate();
                    break;

                case "savings account":
                    // SQL Insert statement
                    String query_2 = "update table_savings set savings_balance=? where account_number=?";

                    // SQL Prepared Statements
                    PreparedStatement prepareStmt_2 = con.prepareStatement(query_2);
                    prepareStmt_2.setDouble(1, money);
                    prepareStmt_2.setInt(2, account_number);

                    // To execute the SQL commands.
                    prepareStmt_2.executeUpdate();
                    break;

                default:
                    System.out.println("Error! Type of Account was incorrect!");
                    break;
            }

            con.close();
        } 
        
        // Catch Exception
        catch (Exception e) 
        {
            System.err.println("Exception");
            System.err.println(e.getMessage());
        }
    }
}