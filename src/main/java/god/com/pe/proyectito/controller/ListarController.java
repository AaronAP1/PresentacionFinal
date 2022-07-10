/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import god.com.pe.proyectito.serviceImpl.informeService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/listas")
public class ListarController {
    
    @Autowired
    private informeService informeService;
    
     @GetMapping()
    public String listas(Model model){
        
        model.addAttribute("infos", informeService.readAll());
        
    return "gestionTR/InformeTecnico";
    }
    
}
