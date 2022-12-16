package org.bedu.jpa.modulo2.service;

import org.bedu.jpa.modulo2.entity.Alumno;
import org.bedu.jpa.modulo2.entity.Profesor;

import java.util.List;

public interface IProfesorService {
    List<Profesor> getAll();
    Profesor getOneById(int id);

    Profesor create (Profesor profesor);

    Profesor update(int id, Profesor profesor);

    Profesor deleteOne(int id);
}
