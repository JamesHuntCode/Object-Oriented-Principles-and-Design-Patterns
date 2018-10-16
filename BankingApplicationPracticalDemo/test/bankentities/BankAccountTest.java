/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class BankAccountTest {
    
    BankAccount testAccount;
    
    public BankAccountTest() {
        testAccount = new BankAccount("James Hunt");
        // ** OBJECT INFORMATION **
        // Holder = James Hunt
        // Balance = 100
        // Overdraft = 500
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
    public void testDepositFunds() {
        testAccount.depositFunds(100); 
        assertEquals(200, testAccount.getBalance());
        testAccount.takeFunds(100);
    }

    @Test
    public void testTakeFunds() {
        // Test with an amount that can be taken:
        testAccount.takeFunds(50);
        assertEquals(50, testAccount.getBalance());
        testAccount.depositFunds(50);
        
        // Test with an amount that is too much to be taken:
        assertFalse(testAccount.takeFunds(200));
    }

    @Test
    public void testGetBalance() {
        assertEquals(100, testAccount.getBalance()); 
    }

    @Test
    public void testGetOverdraft() {
        assertEquals(500, testAccount.getOverdraft());  
    }

    @Test
    public void testGetAccountHolder() {
        assertEquals("James Hunt", testAccount.getAccountHolder());
    }
    
}
