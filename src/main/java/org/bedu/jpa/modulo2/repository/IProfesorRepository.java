package org.bedu.jpa.modulo2.repository;

import org.bedu.jpa.modulo2.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor, Integer> {
    Profesor findOneById(int id);

}
