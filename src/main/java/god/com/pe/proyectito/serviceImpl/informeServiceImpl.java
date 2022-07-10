/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.informe;
import god.com.pe.proyectito.repository.informeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class informeServiceImpl implements informeService {

       @Autowired
     private informeRepository informeRepository;
     
    @Override
    public informe create(informe informe) {
        return informeRepository.save(informe); }

    @Override
    public informe update(informe informe) {
        return informeRepository.save(informe); }

    @Override
    public void delete(int id) {
        informeRepository.deleteById(id);}

    @Override
    public informe read(int id) {
        return informeRepository.findById(id).get();}

    @Override
    public List<informe> readAll() {
        return informeRepository.findAll();}
    
}
