/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.serviceImpl;

import god.com.pe.proyectito.entitys.usuario;
import god.com.pe.proyectito.repository.usuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service

public class usuarioServiceImpl implements usuarioService{
     
      @Autowired
     private usuarioRepository usuarioRepository;
    
    @Override
    public usuario create(usuario usuario) {
        return usuarioRepository.save(usuario);}

    @Override
    public usuario update(usuario usuario) {
        return usuarioRepository.save(usuario);}

    @Override
    public void delete(int id) {
        usuarioRepository.deleteById(id); }

    @Override
    public usuario read(int id) {
        return usuarioRepository.findById(id).get(); }

    @Override
    public List<usuario> readAll() {
       return usuarioRepository.findAll(); }
    
}
