/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabanapayroll;

import java.util.UUID;

/**
 *
 * @author Usuario
 */
public class departament extends SabanaPayroll{
    public UUID id;
    
    
    public departament(String nombre,UUID id, double calculateDepartamentSalaries){
        super(nombre, id, calculateDepartmentSalaries);
        this.id = id;
        
    
    
    
    }



 
}
