/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exwater;

import java.util.ArrayList;

/**
 *
 * @author Sophia Madlentsy
 */
public class ExWater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<User> userList = new ArrayList<>();
         
        LoginRegister log = new LoginRegister(userList); 
        
        System.out.println("==========WELCOME TO WATER INTAKE==========");
        log.menu();
        
        
    }
    
}
