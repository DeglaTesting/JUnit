/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author sa841
 */
public class RunnerJUnit2 {
    
    public static void main(String[] args){
    Result result = JUnitCore.runClasses(JUnit2.class);
    System.out.println("Was succsessful " +result.wasSuccessful());
    for (Failure failure  : result.getFailures()){
    System.out.println(failure.getException());}
    }
    
}
