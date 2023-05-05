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
public class LoadView {
    public LoadView(){
    }
    
    @AnnotedClass(methodName = "formulaire")
    public ModelView loadViewFormulaire(){
        ModelView result = new ModelView("formulaire.jsp");
        return result;
    }

    @AnnotedClass(methodName = "send_datas")
    public ModelView loadViewSend_datas(){
        ModelView result = new ModelView("send_datas.jsp");
        return result;
    }
}
