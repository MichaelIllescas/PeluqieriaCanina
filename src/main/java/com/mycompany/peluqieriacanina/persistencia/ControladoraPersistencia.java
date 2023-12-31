package com.mycompany.peluqieriacanina.persistencia;

import com.mycompany.peluqieriacanina.logica.Duenio;
import com.mycompany.peluqieriacanina.logica.Mascota;
import com.mycompany.peluqieriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;

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

    public void borrarMascota(int num_Cliente) {
        
        try {
            mascotaJpa.destroy(num_Cliente);
        } catch (NonexistentEntityException e) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(SEVERE, null, e);
        }
        
    }

    public Mascota traerMascota(int num_Cliente) {
        return mascotaJpa.findMascota(num_Cliente);
        
    }

    public void modificarMascota(Mascota masco) {
        try {
             mascotaJpa.edit(masco);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(SEVERE, null, e);
        }
        
    }

    public Duenio traerDuenio(int idDuenio) {
       
        return duenioJpa.findDuenio(idDuenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
             duenioJpa.edit(dueno);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(SEVERE, null, e);
        }
       
    }

  


        
}
