/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author sa841
 */
public class TestRunner {

    public static void main(String[] args) {

        Result testresult = JUnitCore.runClasses(AddTest.class);
        for(Failure failure : testresult.getFailures())
        {
            System.out.println(failure.getMessage());
        }
      /*  AddTest addTest = new AddTest();
        addTest.testAdd();*/
    }

}
