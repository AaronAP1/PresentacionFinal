/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.organizacion;
import god.com.pe.proyectito.repository.organizacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service

public class organizacionServiceImpl implements organizacionService{
    
     @Autowired
     private organizacionRepository organizacionRepository;
     
    @Override
    public organizacion create(organizacion organizacion) {
       return organizacionRepository.save(organizacion); }

    @Override
    public organizacion update(organizacion organizacion) {
        return organizacionRepository.save(organizacion); }

    @Override
    public void delete(int id) {
        organizacionRepository.deleteById(id); }

    @Override
    public organizacion read(int id) {
       return organizacionRepository.findById(id).get(); }

    @Override
    public List<organizacion> readAll() {
        return organizacionRepository.findAll(); }
    
}
