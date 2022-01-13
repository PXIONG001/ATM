import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

/**
 * 
 * JUnit testing on the functions. 
 * 
 * @author Pengshing Xiong
 * @version 1.0
 * @since 2022-01-07
 */
public class JUnit_Testing {
    // Account Controller

    /**
     * 
     * Checks if the account is accurate by checking
     * the username and the password. 
     * 
     */
    @Test
    public void AccountCorrect()
    {
        AccountController account_controller = new AccountController();

        assertTrue(account_controller.check_username("MJ"));
        assertTrue(account_controller.check_password("Computers"));
    }

    /**
     * 
     * Checks if the function index_number has gotten the correct index number.
     */
    @Test
    public void index_correct()
    {
        AccountController account_controller = new AccountController();

        assertEquals(0, account_controller.index_number("James"));
    }

    /**
     * 
     * Checks if the string getters and setters from the java file 
     * Account are correctly set and obtained.
     * 
     */
    @Test
    public void Set_Get_correct()
    {
        Account account = new Account();
        Date date = new Date(07-01-2022);
        account.setAccountNumber(302343);
        account.setSavingsBalance(23432.20);
        account.setID(37);
        account.setBirthdate(date);

        assertTrue(302343 == account.getAccountNumber());
        assertTrue(302343 == account.getAccountNumber());
        assertTrue(23432.20 == account.getSavingsBalance());
        assertTrue(date == account.getBirthdate());
    }

    /**
     * 
     */
    @Test
    public void ArrayListNotNull()
    {
        AccountController controller = new AccountController();

        assertNotNull(controller.request_date());
        assertNotNull(controller.request_string("username"));
        assertNotNull(controller.request_string("password"));
        assertNotNull(controller.request_string("first name"));
        assertNotNull(controller.request_string("last name"));
        assertNotNull(controller.request_int("id"));
        assertNotNull(controller.request_int("social security"));
        assertNotNull(controller.request_int("routing number"));
        assertNotNull(controller.request_int("account number"));
        assertNotNull(controller.request_double("checking account"));
        assertNotNull(controller.request_double("savings account"));
    }

}
