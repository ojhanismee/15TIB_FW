/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1067.service;

import com.example.kuis_1067.entity.Mobil_1067;
import com.example.kuis_1067.repo.Mobil_1067Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-8-320
 */

/**
 *
 * @author Hendro Steven
 */
@Service("mobil_1067Service")
@Transactional
public class Mobil_1067Service {

    @Autowired
    private Mobil_1067Repo repo;

    public Mobil_1067 insert(Mobil_1067 mobil_1067) {
        return repo.save(mobil_1067);
    }
    
    public Mobil_1067 update(Mobil_1067 mobil_1067) {
        return repo.save(mobil_1067);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Mobil_1067 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Mobil_1067> getAll(){
        return repo.findAllMobil_1067();
    }
}
