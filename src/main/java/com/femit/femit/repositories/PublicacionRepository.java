package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.femit.femit.models.Publicacion;


public interface PublicacionRepository extends JpaRepository<Publicacion, Integer> {

    @Query(value = "SELECT p FROM Publicacion p WHERE p.usuario.id_usuario = ?1")
    List<Publicacion> findPublicacionByUserId(Integer idUsuario);

    @Query(value = "SELECT p FROM Publicacion p WHERE p.empresa.id_empresa = ?1")
    List<Publicacion> findPublicacionByEmpresaId(Integer idEmpresa);
}
