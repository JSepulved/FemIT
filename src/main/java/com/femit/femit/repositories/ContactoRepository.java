package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.femit.femit.models.Contacto;

public interface ContactoRepository extends JpaRepository <Contacto, Integer>{

    @Query(value = "SELECT * FROM contacto ORDER BY nombre ASC", nativeQuery = true)
    List<Contacto> findAllContactoByNombreAsc();

    @Query(value = "SELECT * FROM contacto ORDER BY nombre DESC", nativeQuery = true)
    List<Contacto> findAllContactoByNombreDesc();
    
}