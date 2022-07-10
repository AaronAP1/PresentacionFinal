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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="organizacion")
public class organizacion implements Serializable {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="ID_ORGANIZACION")
     private int id;
     private int codigo;
     private String nombre;
     private String tipo;
     private String inicio_vigencia;
     private String fin_vigencia;
     private String resolucion;
    
}
