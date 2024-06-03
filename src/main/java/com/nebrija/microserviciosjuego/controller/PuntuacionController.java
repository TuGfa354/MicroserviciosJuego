package com.nebrija.microserviciosjuego.controller;

import com.nebrija.microserviciosjuego.model.Puntuacion;
import com.nebrija.microserviciosjuego.service.PuntuacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/puntuacion")
public class PuntuacionController {
    @Autowired
    private PuntuacionService puntuacionService;
    @GetMapping(value ="/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Puntuacion> findAll(){
        return puntuacionService.findAll();
    }
    @GetMapping(value = "/findById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Puntuacion findById(@PathVariable int id){
        return puntuacionService.findById(id);
    }
    @PostMapping(value = "/save")
    public void save(@RequestBody Puntuacion puntuacion){
         puntuacionService.save(puntuacion);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable int id){
        puntuacionService.deleteById(id);
    }
    @PutMapping(value = "/update")
    public boolean update(@RequestBody Puntuacion puntuacion) {
       return puntuacionService.update(puntuacion);
    }
}
