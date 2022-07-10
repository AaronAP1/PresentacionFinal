/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import god.com.pe.proyectito.serviceImpl.historialService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequestMapping("/visual/login")
public class PrincipalController {
    
    @Autowired
    private historialService historialService;
    
    
    @GetMapping()
    public String login(){
    return "login";
    }
    
    @GetMapping("/proceso")
    public String proceso(){
    return "gestion/soliproceso";
    }
    @GetMapping("/historial")
    public String historial(Model model){
      
    return "gestion/solihistorial";
    }
    
    @GetMapping("/borrar/{id}")
    
    public String borrarHistorial(@PathVariable("id") int ID_HISTORIAL) {
            historialService.delete(ID_HISTORIAL);
            return "redirect:/historial"; 

}
    @GetMapping("/sregistro")
    public String sregistro(){
    return "gestion/soliregistradas";
    }
    
    @GetMapping("/nuevo")
    public String nuevo(){
        return "gestionSoli/registrosoli";
    }
    
    @GetMapping("/actualizacion")
    public String actualizacion(){
        return "gestionSoli/actualizacionsoli";
    }
}
