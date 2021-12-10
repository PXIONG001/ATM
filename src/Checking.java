/**
 * Checking.java will display information on your checking
 * account and allow you to withdraw or deposit money.
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-12-09
 */
public class Checking {
    private Double checking;

    public Checking(Double checking) {
        this.checking = checking;
    }

    /**
     * The getter 
     * 
     * @return This returns the checking balance.
     */
    public double getCheckingBalance() {
        return checking;
    }

    /**
     * The setter
     * 
     * @param checking the amount for your checking
     */
    public void setCheckingBalance(Double checking) {
        this.checking = checking;
    }

}
