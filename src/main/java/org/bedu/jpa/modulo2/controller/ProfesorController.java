package org.bedu.jpa.modulo2.controller;

import org.bedu.jpa.modulo2.entity.Profesor;
import org.bedu.jpa.modulo2.service.IProfesorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfesorController {
    private IProfesorService service;

    public ProfesorController(IProfesorService service){
        this.service = service;
    }
    @GetMapping("/profesores")
    @ResponseStatus(HttpStatus.OK)
    public List<Profesor> getAll(){
        return service.getAll();
    }
    @GetMapping("/profesores/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Profesor getOneById(@PathVariable("id") int id){
        return service.getOneById(id);
    }

    @PostMapping("/profesores")
    @ResponseStatus(HttpStatus.CREATED)
    public Profesor create(@RequestBody Profesor profesor){
        return service.create(profesor);
    }

    @PutMapping("/profesores/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Profesor update(@PathVariable("id") int id, @RequestBody Profesor profesor){
        return service.update(id,profesor);
    }

    @DeleteMapping("/profesores/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Profesor deleteOne(@PathVariable("id") int id){
        return service.deleteOne(id);
    }

}
