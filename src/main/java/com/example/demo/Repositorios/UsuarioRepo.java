/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repositorios;

import com.example.demo.Modelos.UsuarioModel;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fabi
 */
@Repository
public interface UsuarioRepo extends CrudRepository<UsuarioModel, Long>{
    //como parametro va que tipo de usuario es y que tipo de identificador tiene
    
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
//ENCUENTRA LOS USUARIOS POR PRIORIDAD
}

