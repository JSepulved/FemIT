package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.femit.femit.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa,Integer>{
  @Query( value = "SELECT * FROM empresa ORDER BY nombre ASC", nativeQuery = true)
  List <Empresa> findAllEmpresaByNombreAsc();
  

  @Query( value = "SELECT * FROM empresa ORDER BY nombre DESC",nativeQuery = true)
  List <Empresa> findAllEmpresaByNombreDesc();
}
