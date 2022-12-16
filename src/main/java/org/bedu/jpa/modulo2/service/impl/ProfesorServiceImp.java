package org.bedu.jpa.modulo2.service.impl;

import org.bedu.jpa.modulo2.entity.Profesor;
import org.bedu.jpa.modulo2.repository.IProfesorRepository;
import org.bedu.jpa.modulo2.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImp implements IProfesorService {
    private IProfesorRepository repository;

    @Autowired
    public ProfesorServiceImp(IProfesorRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Profesor>getAll(){
        return repository.findAll();
    }
    @Override
    public Profesor getOneById(int id){
        return repository.findOneById(id);
    }

    @Override
    public  Profesor create(Profesor profesor){
        return repository.save(profesor);
    }

    @Override
    public Profesor update(int id, Profesor profesor){
        Profesor updateProfesor = repository.findOneById(id);
        updateProfesor.setName(profesor.getName());
        updateProfesor.setLastName(profesor.getLastName());
        updateProfesor.setControlNumber(profesor.getControlNumber());
        return repository.save(updateProfesor);
    }

    @Override
    public Profesor deleteOne(int id){
        repository.deleteById(id);
        return null;

    }

}
