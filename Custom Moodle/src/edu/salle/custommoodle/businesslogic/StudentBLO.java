/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.businesslogic;

import edu.salle.custommoodle.dataacces.StudentDAO;
import edu.salle.custommoodle.dataacess.implefile.StudentDAOListImple;
import edu.salle.custommoodle.dataacess.implefile.StudentDAOMySQL;
import edu.salle.custommoodle.model.Studend;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class StudentBLO {
    private StudentDAO studentDAO;
    public StudentBLO(){
        studentDAO = new StudentDAOListImple();
    }
    public Studend save(Studend student){
    return studentDAO.save(student);
    }
    
    public List<Studend> findAll(){
        return studentDAO.findAll();
    }
    
    public Studend find(String id){
        return studentDAO.find(id);
    }
}
