package com.nebrija.microserviciosjuego.repository;

import com.nebrija.microserviciosjuego.model.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuntuacionRepository extends JpaRepository<Puntuacion, Integer> {

}