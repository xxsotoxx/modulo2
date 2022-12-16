package org.bedu.jpa.modulo2.service.impl;

import org.bedu.jpa.modulo2.entity.Alumno;
import org.bedu.jpa.modulo2.repository.IAlumnoRepository;
import org.bedu.jpa.modulo2.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImp implements IAlumnoService {
    private IAlumnoRepository repository;

    @Autowired
    public AlumnoServiceImp(IAlumnoRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Alumno> getAll(){
        return repository.findAll();
    }

    @Override
    public Alumno getOneById(int id){
        return repository.findOneById(id);
    }

    @Override
    public Alumno create(Alumno alumno){
        return repository.save(alumno);
    }

    @Override
    public Alumno update(int id, Alumno alumno){
        Alumno updateAlumno = repository.findOneById(id);
        updateAlumno.setName(alumno.getName());
        updateAlumno.setLastName(alumno.getLastName());
        return repository.save(updateAlumno);
    }

    @Override
    public Alumno deleteOne(int id){
        repository.deleteById(id);
        return null;
    }

}
