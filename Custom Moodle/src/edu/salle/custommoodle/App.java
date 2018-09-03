/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle;

import edu.salle.custommoodle.businesslogic.StudentBLO;
import edu.salle.custommoodle.model.Studend;
import edu.salle.custommoodle.view.StudentWindow;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class App {
    
    public static void main(String[] args) {
//        Studend s1 = new Studend("Alex", "Cornejo");
//        Studend s2 = new Studend("Francisco", "Pérez");
//        Studend s3 = new Studend("Carolina", "Murillo");
//        
//        StudentBLO studentBLO = new StudentBLO();
//        studentBLO.save(s1);
//        studentBLO.save(s2);
//        studentBLO.save(s3);
//        
//        List<Studend> studentList = studentBLO.findAll();
//        for (Studend student: studentList) {
//            System.out.println(student);
//        }
        StudentWindow window = new StudentWindow();
        window.setVisible(true);
    }
    
}
