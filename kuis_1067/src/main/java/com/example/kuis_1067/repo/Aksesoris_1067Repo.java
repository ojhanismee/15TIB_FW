/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1067.repo;

import com.example.kuis_1067.entity.Aksesoris_1067;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Aksesoris_1067Repo extends CrudRepository<Aksesoris_1067, Long> {

    @Query("select c from Aksesoris_1067 c")
    public List<Aksesoris_1067> findAllAksesoris_1067();
}
