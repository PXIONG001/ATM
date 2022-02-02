import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
    
    /**
     * 
     * Tests the Account Controller functions.
     * 
     */
    @Test
    public void AccountController_Test()
    {
        // Account Controller
        AccountController ac = new AccountController();

        // Testing check_checking
        assertFalse(ac.check_checking("Steven1"));
        assertTrue(ac.check_checking("MJ"));

        // Testing check_savings
        assertFalse(ac.check_savings("MJ"));
        assertTrue(ac.check_savings("Steven1"));


    }

    /**
     * 
     * Tests the Request Controller functions.
     * 
     */
    @Test
    public void RequestController_Test()
    {
        // Request Controller
        RequestController rc = new RequestController();

        // Testing request_string: username, customer's name, and password
        assertNotNull(rc.request_string("username"));
        assertNotNull(rc.request_string("customer's name"));
        assertNotNull(rc.request_string("password"));
    }


    @Test
    public void Calculations_Test()
    {
        // Calculations
        Calculations calculate = new Calculations();

        // Testing depsoit_calculations
        assertNotEquals(calculate.depsoit_calculations(90.12, 321236.87), 321.99);
        assertTrue(calculate.depsoit_calculations(90.12, 321236.87) == 321326.99);

        // Testing withdraw_calculations
        assertNotEquals(calculate.withdraw_calculations(700.50, 6000.50), 5370.00);
        assertTrue(calculate.withdraw_calculations(700.50, 6000.50) == 5300.00);
    }


    @Test
    public void Application_Test()
    {
        
    }
}
