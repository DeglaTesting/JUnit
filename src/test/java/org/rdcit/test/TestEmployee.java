/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author sa841
 */
public class TestEmployee {
    
    EmployeeDetails employee = new EmployeeDetails();
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    
    @Test
    public void testCalculteAppraisal(){
        employee.setName("Sheldon");
        employee.setAge(30);
        employee.setSalary(800);
        double salary = empBusinessLogic.calculteYearlySalary(employee);
        assertEquals(9600 , salary, 0.0);
        
    }
    
    
}
