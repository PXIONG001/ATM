import java.sql.*;

/**
 * Checking.java will display information on your checking
 * account and allow you to withdraw or deposit money.
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-12-09
 */
public class Database {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/users";
        String user = "";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from owners;");

            while (rs.next()) {
                String users = "";
                for (int i = 1; i <= 11; i++) {
                    users += rs.getString(i) + " | ";
                }
                System.out.println(users);
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
