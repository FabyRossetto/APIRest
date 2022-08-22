/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

import com.example.demo.Modelos.UsuarioModel;
import com.example.demo.Repositorios.UsuarioRepo;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fabi
 */
@Service
public class UsuarioServicio {
    @Autowired
    UsuarioRepo ur;
    
    //metodo para obtener todos los usuarios en un arrayList
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return(ArrayList<UsuarioModel>) ur.findAll();
    }
    
    //metodo para obtener cada usuario con el id asignado
    public UsuarioModel guardarUsuario(UsuarioModel u){
      return  ur.save(u);
          
    }
    
    //es un optional porq si tiene id lo devuelve pero si no lo tiene,no se rompe el programa
    public Optional<UsuarioModel> obtenerPorId(Long id){
        return ur.findById(id);
    }
    
    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
        return ur.findByPrioridad(prioridad);
    }
    
    public boolean eliminarUsuario(Long id){
        try{
        ur.deleteById(id);
       
        return true;
        }catch(Exception a){
            a.getMessage();
           
            return false;
        }
    }
}
