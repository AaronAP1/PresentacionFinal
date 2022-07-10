/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import god.com.pe.proyectito.serviceImpl.historialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import god.com.pe.proyectito.entitys.historial;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/historial")
public class HistorialController {
    
    @Autowired
    private historialService historialService;
    
    @GetMapping
    public String historial(Model model){
        
        model.addAttribute("historial", historialService.readAll());
        
     
    return "gestion/solihistorial";
    }
    
    @GetMapping("/solicitar")
    public String savesoli(Model model){
       
        model.addAttribute("historial", new historial());
        
        return "gestionSoli/registrosoli";
    }
    
    @PostMapping("/solicitar")
    public String savesoli(@Valid @ModelAttribute historial historial, BindingResult result, Model model, RedirectAttributes attributes) {
        historialService.create(historial);
        
        return "redirect:/historial";
    }
    
    
    
    
}
