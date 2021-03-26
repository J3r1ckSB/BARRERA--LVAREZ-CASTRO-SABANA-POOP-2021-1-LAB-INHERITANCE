/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabanapayroll;

import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Usuario
 */
public abstract class SabanaPayroll {
    public String nombre;
    public double calculateEmployeeSalary;
    public double calculateDepartmentSalaries;
    public double calculateUniversitySalaries;
    


    public SabanaPayroll(String nombre, double calculateEmployeeSalary, double calculateDepartmentSalaries) {
        this.nombre = nombre;
        this.calculateEmployeeSalary = calculateEmployeeSalary;
        this.calculateDepartmentSalaries = calculateDepartmentSalaries;
        this.calculateUniversitySalaries = calculateUniversitySalaries;
    }

   

      
}

    


   
    

