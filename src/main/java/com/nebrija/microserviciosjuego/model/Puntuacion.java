package com.nebrija.microserviciosjuego.model;

import jakarta.persistence.*;

@Entity

public class Puntuacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

     @Column (nullable = false, length = 300)
    private String jugador;

     @Column(nullable = false, length = 300)
    private int puntos;

    public Puntuacion() {
    }

    public Puntuacion(int id, String jugador, int puntos) {
        this.id = id;
        this.jugador = jugador;
        this.puntos = puntos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Puntuacion{" +
                "id=" + id +
                ", jugador='" + jugador + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
