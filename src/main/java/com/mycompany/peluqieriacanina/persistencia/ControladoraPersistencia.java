package com.mycompany.peluqieriacanina.persistencia;

import com.mycompany.peluqieriacanina.logica.Duenio;
import com.mycompany.peluqieriacanina.logica.Mascota;
import java.util.List;

/**
 *
 * @author jonii
 */
public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa= new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        
        //crea en la bd el duenio 
        duenioJpa.create(duenio);
        //crea en la Bd mascota
        mascotaJpa.create(mascota);
        
    }

    public List<Mascota> traerMascotas() {
    
        return mascotaJpa.findMascotaEntities();
                
    }
        
}
