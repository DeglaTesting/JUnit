/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author sa841
 */
public class JUnit2 extends TestCase{

    protected double val1;
    protected double val2;

    @Before
    public void setUp() {
        val1 = 2.3;
        val2 = 5.5;
    }
    
   /* public synchronized void addError(Test test, Throwable t){
        super.addError((junit.framework.Test) test, t);
    }*/

    @Test
    public void testAdd() {
        System.out.println("Nomber of runned tests " + this.countTestCases());
        System.out.println("Name of Test case " + this.getName());
        this.setName("My test case");
        System.out.println("NEw setting name " + this.getName());
    }

    @Test
    public void testSum() {
        assertTrue(this.val1 < (this.val1 + this.val2));
    }

    public void tearDown() {
    }

}
