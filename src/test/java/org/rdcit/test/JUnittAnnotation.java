/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import org.junit.*;

/**
 *
 * @author sa841
 */
public class JUnittAnnotation {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("in after class");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void testCase() {
        System.out.println("in test");
    }
    
    @Test
    public void testCase2() {
        System.out.println("in test 2");
    }

    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }

}
