package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.femit.femit.models.Proyecto;

public interface ProyectoRespository extends JpaRepository<Proyecto, Integer> {
    @Query(value = "SELECT * FROM Proyecto ORDER BY nombre_proyect ASC", nativeQuery = true)
    List<Proyecto> findAllProjectByNameAsc();
}
