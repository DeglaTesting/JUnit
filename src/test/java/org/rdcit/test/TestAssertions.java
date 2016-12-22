/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author sa841
 */
public class TestAssertions {

    @Test
    public void TestAssertions() {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        assertEquals(str4, str5);
        assertTrue(val1 < val2);
        assertFalse(val1 > val2);
        assertNotNull(str1);
        assertNull(str3);
        assertSame(str4, str5);
        // assertSame(expectedArray, resultArray);
        assertArrayEquals(expectedArray, resultArray);
        assertSame(str1, str2);
        assertEquals(str1, str2);
    }

    public void myAssert() {
        String str1 = new String("abcl");
        String str11 = str1;
        String str2 = new String("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};
        System.out.println("str4 equals str5 " + str4.equals(str5));
        if (str11 == str1) {
            System.out.println("str11 == str1 TRUE");
        } else {
            System.out.println("str11 == str1 FALSE");
        }
        if (str2 == str1) {
            System.out.println("str2 == str1 TRUE");
        } else {
            System.out.println("str2 == str1 FALSE");
        }
        
        if (str4 == str5) {
            System.out.println("str4 == str5 TRUE");
        } else {
            System.out.println("str4 == str5 FALSE");
        }
    }
}
