package org.bedu.jpa.modulo2.service;

import org.bedu.jpa.modulo2.entity.Alumno;

import java.util.List;

public interface IAlumnoService {
    List<Alumno> getAll();
    Alumno getOneById(int id);

    Alumno create(Alumno alumno);

    Alumno update(int id, Alumno alumno);

    Alumno deleteOne(int id);
}
