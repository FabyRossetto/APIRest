/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controladores;

import com.example.demo.Modelos.UsuarioModel;
import com.example.demo.Services.UsuarioServicio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fabi
 */

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
    @Autowired
    UsuarioServicio us;
    
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
      return  us.obtenerUsuarios();
    }
    
    
    //este metodo retorna el usuario actualizado,con id
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usu){
        return us.guardarUsuario(usu);
        
        
    }
    @GetMapping(path="/{id}")
    public Optional<UsuarioModel>ObtenerPorId(@PathVariable("id") Long id){
      return  us.obtenerPorId(id);
    }
    
    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return us.obtenerPorPrioridad(prioridad);
    }
    
    //pathVariable configura variables dentro de los segmentos de la URL
   @DeleteMapping(path="/{id}")
    public String eliminarPorId(@PathVariable("id")Long id){
        boolean ok= us.eliminarUsuario(id);
        if(ok=true){
           return ("Se pudo eliminar el usuario " + id);
        }
        else{
          return("No se pudo eliminar el usuario "+ id);
        }
      
    }
    
    
    
}
