// Import ResultSet, Connection, DriverManager, and Statement.
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
 * @version 1.0
 * @since 2021-12-09
 */
public class Database {
    ArrayList<Account> accounts = new ArrayList<>();


    /**
     * 
     * The main driver to connect to the user information. 
     * 
     * @param args Does not take any user input.
     * @throws Exception The exception catches if there is no class that exist, or no connection cannot be made.
     */
    public ArrayList<Account> connect() 
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
            
            
            // Loops through the database to get the information. 
            while (rs.next()) {
                // Set a new account class.
                Account user_account = new Account();
                // String variable to store information from the database.
                user_account.setID(rs.getInt("ID"));
                user_account.setUsername(rs.getString("Username"));
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

            // Closes the connection to the database.
            con.close();
        } 
        
        // Catches the Exception.
        catch (Exception e) {
            System.out.println(e);
        }

        return accounts;

    }

    public void insert_balance_information(double money, String type_of_acccout, String username_accout)
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

            switch(type_of_acccout)
            {
                case "checking account":
                    // SQL Insert statement
                    String query = "insert into users (Checking Balance)" + "values (?)";

                    // SQL Prepared Statements
                    PreparedStatement prepareStmt = con.prepareStatement(query);
                    prepareStmt.setDouble(1, money);

                    // To execute the SQL commands.
                    prepareStmt.execute();

                case "savings account":
                    // SQL Insert statement
                    String query_2 = "UPDATE users;" + "SET Checking Balance = ?" + "WHERE Username = ?";

                    // SQL Prepared Statements
                    PreparedStatement prepareStmt_2 = con.prepareStatement(query_2);
                    prepareStmt_2.setDouble(1, money);
                    prepareStmt_2.setString(2, username_accout);

                    // To execute the SQL commands.
                    prepareStmt_2.executeUpdate();
            }

            con.close();
        } 
        
        catch (Exception e) 
        {
            System.err.println("Exception");
            System.err.println(e.getMessage());
        }

        
    }

    public static void main(String[] args)
    {
        Database database = new Database();
        System.out.println();
    }

}
