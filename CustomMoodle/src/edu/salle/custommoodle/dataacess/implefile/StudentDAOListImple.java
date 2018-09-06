/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess.implefile;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.salle.custommoodle.dataacces.StudentDAO;
import edu.salle.custommoodle.model.Studend;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
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
    public List<Studend> findByName(String name) {
        List<Studend> resStudentList = new ArrayList();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        name = name.toLowerCase().trim();
        for (Studend student: studentList) {
            if (student.getLastName().toLowerCase().contains(name) ||
                    student.getName().toLowerCase().contains(name)) {
               resStudentList.add(student);
            }
        }
         return resStudentList;
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

    @Override
    public void load() {
        try {
             Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("students.json"));
        studentList = gson.fromJson(br, new TypeToken<List<Studend>>(){}.getType());
        br.close();
            if (studentList==null) {
                studentList = new ArrayList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

    @Override
    public void commitChanges() {
        
        try {
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("students.json");
            writer.write(gson.toJson(studentList));
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
