/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/visual/login")
public class PrincipalController {
    @GetMapping()
     public String login(){
    return "login";
    }
    
    @GetMapping("/proceso")
    public String proceso(){
    return "gestion/soliproceso";
    }
    @GetMapping("/historial")
    public String historial(){
    return "gestion/solihistorial";
    }
    @GetMapping("/sregistro")
    public String sregistro(){
    return "gestion/soliregistradas";
    }
    
}
