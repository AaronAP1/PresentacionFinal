/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package god.com.pe.proyectito.entitys;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="historial")
@Entity
public class historial implements Serializable{
    
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="ID_HISTORIAL")
    @Id
    private int id;
    private String nombres;
    private String ubicacion;
    private String tipo;
    private String email;
    private String junta_directiva;
    private String estado;
    private String usuario;
    
}
