/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.historial;
import java.util.List;

public interface historialService {
    
     historial create(historial historial);
    historial update(historial historial);
    void delete(int id);
    historial read(int id);
    List<historial> readAll();
    
}
