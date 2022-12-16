package org.bedu.jpa.modulo2.controller;

import org.bedu.jpa.modulo2.entity.Alumno;
import org.bedu.jpa.modulo2.service.IAlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AlumnoController {
    private IAlumnoService service;

    public AlumnoController(IAlumnoService service){
        this.service = service;
    }

    @GetMapping("/alumnos")
    @ResponseStatus(HttpStatus.OK)
    public List<Alumno> getAll(){
        return service.getAll();
    }

    @GetMapping("/alumnos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Alumno getOneById(@PathVariable("id") int id){
        return service.getOneById(id);
    }

    @PostMapping("/alumnos")
    @ResponseStatus(HttpStatus.CREATED)
    public Alumno create(@RequestBody Alumno alumno){
        return service.create(alumno);
    }

    @PutMapping("/alumnos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Alumno update(@PathVariable("id") int id, @RequestBody Alumno alumno){
        return service.update(id,alumno);
    }

    @DeleteMapping("/alumnos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Alumno deleteOne(@PathVariable("id") int id){
        return service.deleteOne(id);
    }



}
