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
public class JUnitTest {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Ignore
    @Test(timeout = 0)
    public void testprintMessage() {
        messageUtil.printMessage();
        
    }

    @Test
    public void testprintSalutationMessage() {
        message = "Hi!" + message;
        assertEquals(message, messageUtil.printSalutationMessage());
    }

}
