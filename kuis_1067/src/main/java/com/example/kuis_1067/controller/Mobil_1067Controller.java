/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1067.controller;

import com.example.kuis_1067.entity.Mobil_1067;
import com.example.kuis_1067.service.Mobil_1067Service;
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
@RequestMapping("/mobil_1067")
public class Mobil_1067Controller {

    @Autowired
    private Mobil_1067Service mobil_1067Service;

    @RequestMapping(method = RequestMethod.POST)
    public Mobil_1067 insert(@RequestBody Mobil_1067 mobil_1067) {
        return mobil_1067Service.insert(mobil_1067);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mobil_1067 update(@RequestBody Mobil_1067 mobil_1067) {
        return mobil_1067Service.update(mobil_1067);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return mobil_1067Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Mobil_1067 getById(@PathVariable("id") Long id){
        return mobil_1067Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil_1067> getAll(){
        return mobil_1067Service.getAll();
    }
}
