package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.femit.femit.models.Publicacion;


public interface PublicacionRepository extends JpaRepository<Publicacion, Integer> {

  @Query( value = " SELECT * FROM publicacion ORDER BY fecha_hora_publicacion ASC", nativeQuery = true)
  List<Publicacion> findAllPublicacionByFechaHoraAsc();

  @Query( value = " SELECT * FROM publicacion ORDER BY fecha_hora_publicacion DESC", nativeQuery = true)
  List<Publicacion> findAllPublicacionByFechaHoraDesc();
}
