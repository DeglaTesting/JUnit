/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author sa841
 */
@Ignore
public class TestJUnit2 {
    String message = "Robert!";
    MessageUtil messageUtil = new MessageUtil(message);
    @Test
    public void testSalutationMessage(){
        System.out.println("Inside the salutation test");
        String message = "Hi" + "Robert!";
        assertEquals(message, messageUtil.printSalutationMessage());
    }
    
}
