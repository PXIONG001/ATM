/**
 * Savings.java will display information on your savings
 * account and allow you to withdraw or deposit money.
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2021-11-30
 */

public class Savings {
    private Double savings;

    public Savings(Double savings) {
        this.savings = savings;
    }

    /**
     * The getter 
     * 
     * @return This returns the savings balance.
     */
    public double getSavingsBalance() {
        return savings;
    }

    /**
     * The setter
     * 
     * @param savings the amount being saved
     */
    public void setSavingsBalance(Double savings) {
        this.savings = savings;
    }

}
