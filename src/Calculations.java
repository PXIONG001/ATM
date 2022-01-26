/**
 * 
 * 
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
     * 
     * 
     * @param deposit_amount
     * @param balance
     * @return
     */
    public double depsoit_calculations(double deposit_amount, double balance)
    {
        deposit = balance + deposit_amount;
        return deposit;
    }

    /**
     * 
     * 
     * 
     * @param withdraw_amount
     * @param balance
     * @return
     */
    public double withdraw_calculations(double withdraw_amount, double balance)
    {
        withdraw = balance - withdraw_amount;
        return withdraw;
    }
}
