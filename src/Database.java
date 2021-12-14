// Import ResultSet, Connection, DriverManager, and Statement.
import java.sql.*;

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

    /**
     * 
     * The main driver to connect to the user information. 
     * 
     * @param args Does not take any user input.
     * @throws Exception The exception catches if there is no class that exist, or no connection cannot be made.
     */
    public static void main(String[] args) throws Exception {

        Wini ini = new Wini(new File("C:\\Users\\pengs\\.vscode\\Java-VSCode_Project\\ATM\\files\\my_INI_file.ini"));

        // Connection to the data base. 
        String url = ini.get("database", "url");
        // The username to the database.
        String user = ini.get("database", "username");
        // The password to the database.
        String password = ini.get("database", "password");

        // Tries to execute the code.
        try {
            // Connector/J
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connection to the database.
            Connection con = DriverManager.getConnection(url, user, password);
            // Statements to utilize SQL commands.
            Statement stmt = con.createStatement();
            // To execute the SQL commands.
            ResultSet rs = stmt.executeQuery("select * from owners;");

            // Loops through the database to get the information. 
            while (rs.next()) {
                // String variable to store information from the database.
                String users = "";
                for (int i = 1; i <= 11; i++) {
                    // Information from database is stored into users.
                    users += rs.getString(i) + " | ";
                }
                System.out.println(users);
            }

            // Closes the connection to the database.
            con.close();
        } 
        
        // Catches the Exception.
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
