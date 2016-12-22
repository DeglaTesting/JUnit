/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package or.rdcit.testRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.rdcit.test.JUnittAnnotation;

/**
 *
 * @author sa841
 */
public class TestRunnerAnnotation {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JUnittAnnotation.class);
        System.out.println("getRunCount" + result.getRunCount());
        System.out.println("getFailureCount" + result.getFailureCount());
        System.out.println("getIgnoreCount" + result.getIgnoreCount());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.getMessage());
        }
        System.out.println(result.wasSuccessful());
    }

}
