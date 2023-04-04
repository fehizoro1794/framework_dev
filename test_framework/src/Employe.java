/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import etu1794.framework.AnnotedClass;
import etu1794.framework.ModelView;

/**
 *
 * @author rango;
 */
public class Employe {
    private String idEmploye;
    private String nameEmploye;

    // Usefull function
    @AnnotedClass(methodName = "test")
    public ModelView loadViewTest(){
        ModelView result = new ModelView("test.jsp");
        return result;
    }

    @AnnotedClass(methodName = "test2")
    public ModelView loadViewTest2(){
        ModelView result = new ModelView("test2.jsp");
        return result;
    }

    public String getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(String idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNameEmploye() {
        return nameEmploye;
    }

    public void setNameEmploye(String nameEmploye) {
        this.nameEmploye = nameEmploye;
    }
}
