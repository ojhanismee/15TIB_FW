/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1067.service;

import com.example.kuis_1067.entity.Aksesoris_1067;
import com.example.kuis_1067.repo.Aksesoris_1067Repo;
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
@Service("aksesoris_1067Service")
@Transactional
public class Aksesoris_1067Service {

    @Autowired
    private Aksesoris_1067Repo repo;

    public Aksesoris_1067 insert(Aksesoris_1067 aksesoris_1067) {
        return repo.save(aksesoris_1067);
    }
    
    public Aksesoris_1067 update(Aksesoris_1067 aksesoris_1067) {
        return repo.save(aksesoris_1067);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Aksesoris_1067 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Aksesoris_1067> getAll(){
        return repo.findAllAksesoris_1067();
    }
}
