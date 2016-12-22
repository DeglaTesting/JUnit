/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author sa841
 */
@RunWith(Parameterized.class)
public class JUnitParameterizedTest {

    private ParameterizedTest paramTest;
    private Boolean expectedResult;
    private Integer inputNumber;

    @Before
    public void initialization() {
        paramTest = new ParameterizedTest();
    }

    public JUnitParameterizedTest(Integer inputNumber, Boolean expectedResult) {
        this.expectedResult = expectedResult;
        this.inputNumber = inputNumber;
    }

    @Parameterized.Parameters
    public static Collection primeNumber() {
        return Arrays.asList(new Object[][]{
            {2, true},
            {6, false},
            {8, true},
            {10, false},
            {23, true}

        });
    }

    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Test prime Chechker");
        assertEquals(expectedResult, paramTest.validate(inputNumber));
    }
}
