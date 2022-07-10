/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.resolucion;
import god.com.pe.proyectito.repository.resolucionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class resolucionServiceImpl implements resolucionService {
     
      @Autowired
     private resolucionRepository resolucionRepository;

    @Override
    public resolucion create(resolucion resolucion) {
        return resolucionRepository.save(resolucion); }

    @Override
    public resolucion update(resolucion resolucion) {
        return resolucionRepository.save(resolucion); }

    @Override
    public void delete(int id) {
        resolucionRepository.deleteById(id); }

    @Override
    public resolucion read(int id) {
        return resolucionRepository.findById(id).get(); }

    @Override
    public List<resolucion> readAll() {
        return resolucionRepository.findAll();}
    
}
