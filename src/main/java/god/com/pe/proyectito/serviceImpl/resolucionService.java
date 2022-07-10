/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.resolucion;
import java.util.List;

public interface resolucionService {
    resolucion create(resolucion resolucion);
    resolucion update(resolucion resolucion);
    void delete(int id);
    resolucion read(int id);
    List<resolucion> readAll();
}
