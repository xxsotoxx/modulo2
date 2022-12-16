package org.bedu.jpa.modulo2.repository;

import org.bedu.jpa.modulo2.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno, Integer> {
    Alumno findOneById(int id);
}
