package com.nebrija.microserviciosjuego.dao.implDao;

import com.nebrija.microserviciosjuego.dao.DaoPuntuacion;
import com.nebrija.microserviciosjuego.model.Puntuacion;
import com.nebrija.microserviciosjuego.repository.PuntuacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoPuntuacionImpl implements DaoPuntuacion {

@Autowired
    private PuntuacionRepository puntuacionRepository;
    @Override
    public List<Puntuacion> findAll() {
        return puntuacionRepository.findAll();
    }

    @Override
    public Puntuacion findById(int id) {
        return puntuacionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Puntuacion puntuacion) {
     puntuacionRepository.save(puntuacion);
    }

    @Override
    public void deleteById(int id) {
puntuacionRepository.deleteById(id);
    }

    @Override
    public void update(Puntuacion puntuacion) {
    puntuacionRepository.save(puntuacion);
    }
}
