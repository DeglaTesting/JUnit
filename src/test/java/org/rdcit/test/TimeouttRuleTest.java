/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 *
 * @author sa841
 */
public class TimeouttRuleTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void testSlowMethod1() {
        try {
            System.out.println("In the testSlowMethod 1");
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TimeouttRuleTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testSlowMethod2() {
        System.out.println("In the testSlowMethod 2 ");
    }
}
