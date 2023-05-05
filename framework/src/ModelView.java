/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1794.framework;

import java.util.HashMap;

/**
 *
 * @author rango;
 */
public class ModelView {
    private String vue;
    private HashMap<String, Object> data=new HashMap<>();

    public void addIdem(String key, Object value){
        this.getData().put(key, value);
    }

    public ModelView(String vue) {
        this.setVue(vue);
    }

    public ModelView(){}

    

    public String getVue() {
        return vue;
    }

    public void setVue(String vue) {
        this.vue = vue;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
    
}
