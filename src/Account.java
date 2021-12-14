/**
 * Account.java is the class for the account. 
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-12-04
 */
public class Account {
    private String name;
    private String password;

    /**
     * 
     * The constructor.
     * 
     * @param name The user's name
     * @param password The user's password
     */
    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * 
     * Getter for getting the name
     * 
     * @return Returns the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * Setter for setting the name.
     * 
     * @param name The user's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * Getter for getting the name.
     * 
     * @return Returns the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * Setter for setting the name.
     * 
     * @param password The user's password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
