package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.femit.femit.models.Mensaje;

public interface MensajeRepository extends JpaRepository <Mensaje, Integer>{
    @Query(value = "SELECT * FROM mensaje ORDER BY nombre ASC", nativeQuery = true)
    List<Mensaje> findAllMensajeByNombreAsc();

    @Query(value = "SELECT * FROM mensaje ORDER BY nombre DESC", nativeQuery = true)
    List<Mensaje> findAllMensajeByNombreDesc();

}
