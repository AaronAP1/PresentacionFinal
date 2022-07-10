/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.solicitud;
import god.com.pe.proyectito.repository.solicitudRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class solicitudServiceImpl implements solicitudService{
     
     @Autowired
     private solicitudRepository solicitudRepository;

    @Override
    public solicitud create(solicitud solicitud) {
        return solicitudRepository.save(solicitud); }

    @Override
    public solicitud update(solicitud solicitud) {
        return solicitudRepository.save(solicitud);}

    @Override
    public void delete(int id) {
       solicitudRepository.deleteById(id); }

    @Override
    public solicitud read(int id) {
       return solicitudRepository.findById(id).get(); }

    @Override
    public List<solicitud> readAll() {
        return solicitudRepository.findAll(); }
    
}
