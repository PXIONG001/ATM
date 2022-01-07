import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JUnit_Testing {
    
    @Test
    public void AccountCorrect()
    {
        AccountController account_controller = new AccountController();

        assertTrue(account_controller.check_username("MJ"));
        assertTrue(account_controller.check_password("Computers"));
    }

    @Test
    public void index_correct()
    {
        AccountController account_controller = new AccountController();

        assertEquals(0, account_controller.index_number("James"));
    }
}
