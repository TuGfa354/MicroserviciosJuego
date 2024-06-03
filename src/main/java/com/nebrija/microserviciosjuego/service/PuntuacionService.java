package com.nebrija.microserviciosjuego.service;

import com.nebrija.microserviciosjuego.model.Puntuacion;

import java.util.List;

public interface PuntuacionService {
    List<Puntuacion> findAll();
    Puntuacion findById(int id);
    boolean save(Puntuacion puntuacion);
    void deleteById(int id);
    boolean update(Puntuacion puntuacion);
}
