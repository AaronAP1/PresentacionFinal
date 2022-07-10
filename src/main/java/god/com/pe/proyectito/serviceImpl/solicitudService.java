/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.solicitud;
import java.util.List;
public interface solicitudService {
    solicitud create(solicitud solicitud);
    solicitud update(solicitud resolucion);
    void delete(int id);
    solicitud read(int id);
    List<solicitud> readAll();
}
