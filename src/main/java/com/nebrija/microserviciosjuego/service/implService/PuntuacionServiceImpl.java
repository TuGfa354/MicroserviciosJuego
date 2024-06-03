package com.nebrija.microserviciosjuego.service.implService;

import com.nebrija.microserviciosjuego.dao.DaoPuntuacion;
import com.nebrija.microserviciosjuego.model.Puntuacion;
import com.nebrija.microserviciosjuego.repository.PuntuacionRepository;
import com.nebrija.microserviciosjuego.service.PuntuacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuntuacionServiceImpl implements PuntuacionService {
    @Autowired
    private PuntuacionRepository puntuacionRepository;
    @Autowired
    private DaoPuntuacion daoPuntuacion;


    @Override
    public List<Puntuacion> findAll() {
        return daoPuntuacion.findAll();
    }

    @Override
    public Puntuacion findById(int id) {
        return daoPuntuacion.findById(id);
    }

    @Override
    public boolean save(Puntuacion puntuacion) {
        if (daoPuntuacion.findById(puntuacion.getId()) == null) {
            daoPuntuacion.save(puntuacion);
            System.out.println("Se ha creado con éxito");
            return true;
        } else {
            System.out.println("Ya existe");
            return false;
        }
    }

    @Override
    public void deleteById(int id) {
        if (daoPuntuacion.findById(id) != null) {
            daoPuntuacion.deleteById(id);
            System.out.println("Se ha eliminado con éxito");
        } else {
            System.out.println("No existe");
        }
    }

    @Override
    public boolean update(Puntuacion puntuacion) {
        if (daoPuntuacion.findById(puntuacion.getId()) != null) {
            daoPuntuacion.update(puntuacion);
            System.out.println("Se ha modificado con éxito");
            return true;
        } else {
            System.out.println("No existe");
            return false;
        }
    }
}
