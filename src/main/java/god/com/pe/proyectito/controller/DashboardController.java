
package god.com.pe.proyectito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import god.com.pe.proyectito.serviceImpl.solicitudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;



@Controller
@RequestMapping("/dash/gdos")
public class DashboardController {
      @Autowired
      private solicitudService solicitudService;
      
     @GetMapping()
     public String index(Model model){
         model.addAttribute("dash", solicitudService.readAll());
         
         
         
    return "dashboard";
    }
    
     @GetMapping("/informe")
     public String informe(){
         
        
         return "gestionTR/InformeTecnico";
     }
     
     @GetMapping("/publicaciones")
     public String publicaciones(){
         return "gestionTR/ResolucionesSociales";
     }
     
     @GetMapping("/resoluciones")
     public String resoluciones(){
         return "gestionTR/Publicaciones";
     }
}
