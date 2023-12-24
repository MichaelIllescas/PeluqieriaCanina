
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
    
}
