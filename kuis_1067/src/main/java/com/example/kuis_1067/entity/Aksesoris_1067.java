/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1067.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "tbl_aksesoris_1067")
public class Aksesoris_1067 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String name;
    @Column(length = 255, nullable = true)
    private String keterangan;
    @Column(length = 255, nullable = true)
    private String jenis;
    
     
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the keterangan
     */
    public String getDescription() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setDescription(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getJenis() {
        return jenis;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    /**
     * @return the name
     */
    
}
