/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1067.controller;

import com.example.kuis_1067.entity.Aksesoris_1067;
import com.example.kuis_1067.service.Aksesoris_1067Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/aksesoris_1067")
public class Aksesoris_1067Controller {

    @Autowired
    private Aksesoris_1067Service aksesoris_1067Service;

    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris_1067 insert(@RequestBody Aksesoris_1067 aksesoris_1067) {
        return aksesoris_1067Service.insert(aksesoris_1067);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aksesoris_1067 update(@RequestBody Aksesoris_1067 aksesoris_1067) {
        return aksesoris_1067Service.update(aksesoris_1067);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return aksesoris_1067Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Aksesoris_1067 getById(@PathVariable("id") Long id){
        return aksesoris_1067Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris_1067> getAll(){
        return aksesoris_1067Service.getAll();
    }
}
