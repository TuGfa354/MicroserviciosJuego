package com.nebrija.microserviciosjuego.dao;

import com.nebrija.microserviciosjuego.model.Puntuacion;

import java.util.List;

public interface DaoPuntuacion {
    List<Puntuacion> findAll();
    Puntuacion findById(int id);
    void save(Puntuacion puntuacion);
    void deleteById(int id);
    void update(Puntuacion puntuacion);
}
