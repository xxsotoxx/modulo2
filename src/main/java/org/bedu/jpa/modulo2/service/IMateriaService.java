package org.bedu.jpa.modulo2.service;

import org.bedu.jpa.modulo2.entity.Materia;

import java.util.List;

public interface IMateriaService {
    List<Materia> getAll();
    Materia getOneById(int id);
}
