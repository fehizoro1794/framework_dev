/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import etu1794.framework.Annoted;

/**
 *
 * @author ITU
 */
public class Employe {
    int id;
    String nom;
    
    @Annoted(methodName = "say_emp")
    public void sayEmploye(){
        System.out.println("employe");
    }
    

    public void sayDept(){
        System.out.println("dept");
    }
    
     @Annoted(methodName = "say_something")
    public void printSomething(String smt){
        System.out.println(smt);
    }
}
