/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

/**
 *
 * @author sa841
 */
public class ParameterizedTest1 {

    final int top = 10;

    public ParameterizedTest1() {
    }

    public Boolean ifInfTop( int i) {
        System.out.println("Parametrized number is : " + i);
        return i <= this.top;
    }
}
