/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess.implefile;

import edu.salle.custommoodle.dataacces.StudentDAO;
import edu.salle.custommoodle.model.Studend;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class StudentDAOListImple implements StudentDAO {
    private  static List<Studend> studentList = new ArrayList();
    
    @Override
    public Studend save(Studend student) {
        String id = Integer.toString(studentList.size() + 1);
        student.setId(id);
        studentList.add(student);
        return student;
    }

    @Override
    public List<Studend> findAll() {
         //throw new UnsupportedOperationException("Not supported yet.");
        return studentList;
    }

    @Override
    public Studend find(String id) {
        for (Studend student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Studend findByName(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        name = name.toLowerCase().trim();
        for (Studend student: studentList) {
            if (student.getLastName().toLowerCase().contains(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void delete(Studend student) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        studentList.remove(student);
    }

    @Override
    public void update(Studend student) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int pos = studentList.indexOf(student);
        studentList.set(pos, student);
    }
    
}
