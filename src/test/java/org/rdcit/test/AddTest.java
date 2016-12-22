/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sa841
 */
public class AddTest {
    
    public AddTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Add.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Add instance = new Add();
        int expResult = 0;
        int result = instance.add();
        assertEquals(expResult, result);
        assertTrue(result > (instance.val1 + instance.val2));
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
       
    }
    
}
