/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

/**
 *
 * @author ASUS
 */
public class Studend {

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Studend(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }
    
    private String name;
    private String lastName;
    private String id;
    
 

    @Override
    public String toString() {
        return String.format("id=%s,\n name=%s,\n lastName=%s",id,name,lastName); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    
}
