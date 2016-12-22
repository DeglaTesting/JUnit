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
public class MessageUtil {

    String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Just making delay");
        while (true);
    }

    public String printSalutationMessage() {
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
