/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import etu1794.framework.AnnotedClass;

/**
 *
 * @author ITU
 */
public class Departement {
    @AnnotedClass(methodName = "attribut_id")
       int id;
    
    String nom;
    
    @AnnotedClass(methodName = "dept_func")
    public void func_dept(){
        System.out.println("function");
    }
}
