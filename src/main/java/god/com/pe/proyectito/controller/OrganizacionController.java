/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import god.com.pe.proyectito.serviceImpl.organizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/organizacion")
public class OrganizacionController {
    
    @Autowired
    private organizacionService organizacionService;
    
    @GetMapping()
    public String organizacion(Model model){
    
     model.addAttribute("orga", organizacionService.readAll());
     
     return "gestionTR/Publicaciones";
    }
    
    
}
