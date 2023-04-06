package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.femit.femit.models.Usuaria;

public interface UsuariaRepository extends JpaRepository<Usuaria,Integer>{
  
   @Query( value = " SELECT * FROM usuario ORDER BY nombre ASC", nativeQuery = true)
  List<Usuaria> findAllUsuariaByNombreAsc();

  @Query( value = " SELECT * FROM usuario ORDER BY nombre DESC", nativeQuery = true)
  List<Usuaria> findAllUsuariaByNombreDesc();
}
