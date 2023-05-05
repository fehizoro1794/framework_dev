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

    public Employe(){
        this.idEmploye="1";
        this.nameEmploye="nom_de_test";
    }

    @AnnotedClass(methodName = "components")
    public ModelView getEverything(){
        ModelView modelView = new ModelView("components.jsp");
        modelView.addIdem("idEmploye", this.idEmploye);
        modelView.addIdem("nameEmploye", this.nameEmploye);
        modelView.addIdem("getAll", this.getAll());

        return modelView;
    }
    
    @Override
    public String toString() {
        return "Employe [idEmploye=" + idEmploye + ", nameEmploye=" + nameEmploye + "]";
    }

    // Usefull function
    public Employe[] getAll() {
        Employe[] listEmp = new Employe[3];
        listEmp[0] = new Employe();
        listEmp[0].setIdEmploye("1");
        listEmp[0].setNameEmploye("Jean");

        listEmp[1] = new Employe();
        listEmp[1].setIdEmploye("2");
        listEmp[1].setNameEmploye("Jacque");

        listEmp[2] = new Employe();
        listEmp[2].setIdEmploye("3");
        listEmp[2].setNameEmploye("Jacob");

        return listEmp;
    }
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
