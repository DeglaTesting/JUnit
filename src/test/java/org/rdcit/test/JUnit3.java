/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import org.junit.Test;

/**
 *
 * @author sa841
 */
public class JUnit3 extends TestResult {

    public synchronized void addError(Test test, Throwable t) {
        super.addError((junit.framework.Test) test, t);
    }

    public synchronized void addFailure(Test test, AssertionFailedError  t) {
        super.addFailure((junit.framework.Test) test, t);
    }

}
