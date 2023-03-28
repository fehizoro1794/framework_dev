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
public class Departement {
    @Annoted(methodName = "attribut_id")
       int id;
    
    String nom;
    
    @Annoted(methodName = "dept_func")
    public void func_dept(){
        System.out.println("function");
    }
}
