/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Modelos;

import javax.persistence.*;
//con el asterisco se importan todas las librerias de JPA


/**
 *
 * @author Fabi
 */

@Entity
@Table(name="usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)//se genera automaticamente y se autoincrementa
    @Column(unique=true,nullable=false)//es unico y no puede ser nulo
    private Long id;
    private String nombre;
    private String email;
    private Integer prioridad;

    public UsuarioModel() {
    }

    public UsuarioModel(Long id, String nombre, String email, Integer prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
    
    
    
    
}
