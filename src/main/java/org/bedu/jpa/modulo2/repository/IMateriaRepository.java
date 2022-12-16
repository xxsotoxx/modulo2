package org.bedu.jpa.modulo2.repository;

import org.bedu.jpa.modulo2.entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaRepository extends JpaRepository <Materia, Integer> {
    Materia findOneById(int id);
}
