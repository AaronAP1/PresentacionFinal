/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.historial;
import god.com.pe.proyectito.repository.historialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class historialServiceImpl implements historialService {
     
      @Autowired
     private historialRepository historialRepository;

    @Override
    public historial create(historial historial) {
        return historialRepository.save(historial);}

    @Override
    public historial update(historial historial) {
       return historialRepository.save(historial); }

    @Override
    public void delete(int id) {
       historialRepository.deleteById(id); }

    @Override
    public historial read(int id) {
       return historialRepository.findById(id).get(); }

    @Override
    public List<historial> readAll() {
       return historialRepository.findAll(); }
    
}
