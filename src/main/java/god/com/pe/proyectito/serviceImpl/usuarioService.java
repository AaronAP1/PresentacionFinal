/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.usuario;
import java.util.List;
public interface usuarioService {
     usuario create(usuario usuario);
    usuario update(usuario resolucion);
    void delete(int id);
    usuario read(int id);
    List<usuario> readAll();
    
}
