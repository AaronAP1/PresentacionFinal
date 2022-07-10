/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.informe;
import java.util.List;
public interface informeService {
     informe create(informe informe);
    informe update(informe resolucion);
    void delete(int id);
    informe read(int id);
    List<informe> readAll();
    
}
