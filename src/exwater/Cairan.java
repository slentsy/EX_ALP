/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exwater;

/**
 *
 * @author Sophia Madlentsy
 */
public abstract class Cairan {
    //ini untuk gula yang ada di minuman-minuman 
    //nnati gulanya bisa di set oleh user
    public int gula; 

    public int getGula() {
        return gula;
    }

    public void setGula(int gula) {
        this.gula = gula;
    }
    
    //constructor 
    public Cairan (int gula){
        this.gula = gula; 
    }
}
