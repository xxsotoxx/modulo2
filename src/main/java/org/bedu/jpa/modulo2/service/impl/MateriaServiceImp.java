package org.bedu.jpa.modulo2.service.impl;

import org.bedu.jpa.modulo2.entity.Materia;
import org.bedu.jpa.modulo2.repository.IMateriaRepository;
import org.bedu.jpa.modulo2.service.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImp implements IMateriaService {
    private IMateriaRepository repository;

    @Autowired
    public MateriaServiceImp(IMateriaRepository repository){
        this.repository = repository;
    }
    @Override
    public List<Materia> getAll(){
        return repository.findAll();
    }

    @Override
    public Materia getOneById(int id){
        return repository.findOneById(id);
    }
}
