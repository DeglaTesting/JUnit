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
public class ParameterizedTest {

    public Boolean validate(final int primetive) {
        boolean res = false;
        for (int i = 2; i < (primetive / 2); i++) {
            if (primetive % 2 == 0) {
                res = true;
            }
        }
        return res;
    }
}
