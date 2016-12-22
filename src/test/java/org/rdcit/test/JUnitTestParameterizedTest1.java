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
public class JUnitTestParameterizedTest1 {

    private ParameterizedTest1 paramTest;
    private Boolean expectedRes;
    private int input;

    @Before
    public void initialization() {
        paramTest = new ParameterizedTest1();
    }

    public JUnitTestParameterizedTest1(int input, Boolean expectedRes) {
        this.expectedRes = expectedRes;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection inputIntegers() {
        return Arrays.asList(new Object[][]{
            {10, true},
            {5, false},
            {12, true},
            {5, true}
        });
    }

    @Test
    public void testParameterizedTest() {
        assertEquals(this.expectedRes, paramTest.ifInfTop(this.input));
    }

}
