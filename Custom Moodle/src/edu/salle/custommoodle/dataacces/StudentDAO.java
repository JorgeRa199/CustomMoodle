/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacces;

import edu.salle.custommoodle.model.Studend;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface StudentDAO {
    public Studend save(Studend student);
    public List<Studend> findAll();
    public Studend find(String id);
    
    
    
    
}
