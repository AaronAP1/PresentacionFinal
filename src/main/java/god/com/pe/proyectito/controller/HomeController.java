package god.com.pe.proyectito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
    @GetMapping()
     public String index(){
    return "principal";
    }
     @GetMapping("/registro")
     public String registro(){
         return"registro";
     }
     @GetMapping("/principal")
     public String principal(){
         return"principal";
     }
}
