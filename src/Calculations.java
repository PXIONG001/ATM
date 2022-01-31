/**
 * 
 * The Calculations file does the calculations for the program.
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2022-01-25
 */
public class Calculations {

    double deposit;
    double withdraw;
    
    /**
     * 
     * Calculate the deposit amount for the account
     * 
     * @param deposit_amount the deposit amount to deposit
     * @param balance the total balance from the account
     * @return
     */
    public double depsoit_calculations(double deposit_amount, double balance)
    {
        deposit = balance + deposit_amount;
        return deposit;
    }

    /**
     * 
     * Calculate the withdrawal amount for the account
     * 
     * @param withdraw_amount the withdrawal amount to withdraw
     * @param balance the total balance from the account
     * @return
     */
    public double withdraw_calculations(double withdraw_amount, double balance)
    {
        withdraw = balance - withdraw_amount;
        return withdraw;
    }
}
