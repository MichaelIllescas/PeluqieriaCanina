
package com.mycompany.peluqieriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author joniathan Illescas
 */
@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private int idDuenio;
    private String nombre;
    private  String direccion;
    private String celDuenio;
    
    public Duenio(){
    }

    public Duenio(int idDuenio, String nombre, String direccion, String celDuenio) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celDuenio = celDuenio;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
        
}
