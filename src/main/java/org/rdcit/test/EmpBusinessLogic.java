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
public class EmpBusinessLogic {

    public double calculteYearlySalary(EmployeeDetails employeeDetails) {
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getSalary() * 12;
        return yearlySalary;
    }

    public double calculateAppraisal(EmployeeDetails employeeDetails)
    {
        double appraisal = 0;
        if(employeeDetails.getSalary() < 1000)
            appraisal = 500;
        else 
            appraisal = 1000;
        return appraisal;
    }    
}
