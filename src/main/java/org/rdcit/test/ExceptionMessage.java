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
public class ExceptionMessage {

    private String message;

    public ExceptionMessage(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(this.message);
        int a = 0;
        int b = 1 / a;
        return this.message;
    }

    public String printSalutationMessage() {
        message = "hi" + message;
        System.out.println(this.message);
        return this.message;
    }

}
