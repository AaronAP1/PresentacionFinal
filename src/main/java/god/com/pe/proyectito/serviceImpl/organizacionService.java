/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.organizacion;
import java.util.List;
public interface organizacionService {
    
    organizacion create(organizacion resolucion);
    organizacion update(organizacion resolucion);
    void delete(int id);
    organizacion read(int id);
    List<organizacion> readAll();
    
}
