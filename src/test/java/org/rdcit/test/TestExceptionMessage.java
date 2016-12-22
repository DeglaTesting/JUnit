/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author sa841
 */
public class TestExceptionMessage {

    ExceptionMessage exceptionMessage = new ExceptionMessage("Sheldon");

    @Test (expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("In the test print message");
        String message = "Hi Sheldon";
        assertEquals(message, exceptionMessage.printMessage());
    }
}
