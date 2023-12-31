
package com.mycompany.peluqieriacanina.logica;

import com.mycompany.peluqieriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author joniathan Illescas
 */
public class Controladora {

    ControladoraPersistencia controlPersis= new ControladoraPersistencia();

    public void guardar(String nombreMasco, String razaMasco, String colorMasco, String observacion, String nombreDuenio, String celDuenio, String dirDuenio, String alergico, String atenEsp) {
        
        Duenio duenio= new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        duenio.setDireccion(dirDuenio);
           
        Mascota mascota= new Mascota();
        mascota.setNombre(nombreMasco);
        mascota.setColor(colorMasco);
        mascota.setRaza(razaMasco);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atenEsp);
        mascota.setObservaciones(observacion);
        mascota.setUnDuenio(duenio);
        
        
       controlPersis.guardar(duenio, mascota);
    
        
    
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_Cliente) {
      controlPersis.borrarMascota(num_Cliente);
    }

 

    public Mascota traerMascota(int num_Cliente) {
        
     return controlPersis.traerMascota(num_Cliente);
     
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String razaMasco, String colorMasco, String observacion, String nombreDuenio, String celDuenio, String dirDuenio, String alergico, String atenEsp) {
        
        masco.setNombre(nombreMasco);
        masco.setRaza(razaMasco);
        masco.setObservaciones(observacion);
        masco.setColor(colorMasco);
        masco.setAtencion_especial(atenEsp);
        masco.setAlergico(alergico);
        
        //modifico la moscota
        
        controlPersis.modificarMascota(masco);
        
        Duenio dueno= this.buscarDuenio(masco.getUnDuenio().getIdDuenio());
        
        //seteo al sueño
        dueno.setNombre(nombreDuenio);
        dueno.setCelDuenio(celDuenio);
        dueno.setDireccion(dirDuenio);
        
        
        //llamar a modificar al dueño
        this.modificarDuenio(dueno);
        
    }

    private Duenio buscarDuenio(int idDuenio) {
        return controlPersis.traerDuenio(idDuenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
    
}
