import java.util.Date;

/**
 * Account.java is the class for the account. 
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-12-04
 */
public class Account {
    private int id;
    private String username;
    private String password;
    private Date birthdate;
    private String customer_name;
    private int social_security;
    private int routing_number;
    private int account_number;
    private double checking_balance;
    private double savings_balance;

    /**
     * Gets the ID number that was set.
     * 
     * @return returns the ID
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the ID number of the user. 
     * 
     * @param id The ID number of the user.
     */
    public void setID(Integer id) {
        this.id = id;
    }

    /**
     * 
     * Getter for getting the name.
     * 
     * @return Returns the user's name
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * Setter for setting the name.
     * 
     * @param name The user's name
     */
    public void setUsername(String username) {
        this.username = username;
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
    
    /**
    * 
    * @return
    */
   public Date getBirthdate() {
       return birthdate;
   }

   /**
    * 
    * @param birthdate
    */
   public void setBirthdate(Date birthdate) {
       this.birthdate = birthdate;
   }

   /**
    * 
    * @return
    */
    public String getCustomerName() {
        return customer_name;
    }

    /**
     * 
     * @param customer_name
     */
    public void setCustomerName(String customer_name) {
        this.customer_name = customer_name;
    }

    /**
    * 
    * @return
    */
    public int getSocialSecurity() {
        return social_security;
    }
 
    /**
     * 
     * @param social_security
     */
    public void setSocialSecurity(Integer social_security) {
        this.social_security = social_security;
    }

    /**
    * 
    * @return
    */
    public int getRoutingNumber() {
        return routing_number;
    }
 
    /**
     * 
     * @param routing_number
     */
    public void setRoutingNumber(Integer routing_number) {
        this.routing_number = routing_number;
    }

    /**
    * 
    * @return
    */
    public int getAccountNumber() {
        return account_number;
    }
 
    /**
     * 
     * @param account_number
     */
    public void setAccountNumber(Integer account_number) {
        this.account_number = account_number;
    }

    /**
    * 
    * @return
    */
    public double getCheckingBalance() {
        return checking_balance;
    }
 
    /**
     * 
     * @param checking_balance
     */
    public void setCheckingBalance(Double checking_balance) {
        this.checking_balance = checking_balance;
    }

    /**
    * 
    * @return
    */
    public double getSavingsBalance() {
        return savings_balance;
    }
 
    /**
     * 
     * @param checking_balance
     */
    public void setSavingsBalance(Double savings_balance) {
        this.savings_balance = savings_balance;
    }

}
