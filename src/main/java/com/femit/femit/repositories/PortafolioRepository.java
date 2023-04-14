package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.femit.femit.models.Portafolio;

public interface PortafolioRepository extends JpaRepository<Portafolio, Integer> {

    @Query(value = "SELECT * FROM Portafolio ORDER BY id_usuario ASC", nativeQuery = true)
    List<Portafolio> findAllPortafolioByIdUsuarioAsc();
    
    @Query( value = "SELECT * FROM Portafolio ORDER BY id_usuario DESC", nativeQuery = true)
    List<Portafolio> findAllPortafolioByIdUsuarioDesc();
    
}
