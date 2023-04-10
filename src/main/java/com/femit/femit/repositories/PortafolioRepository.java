package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.femit.femit.models.Portafolio;

public interface PortafolioRepository extends JpaRepository<Portafolio, Integer> {

    @Query("SELECT p FROM Portafolio p ORDER BY p.nombre ASC")
    List<Portafolio> findAllPortafolioByNombreAsc();
    
    @Query("SELECT p FROM Portafolio p ORDER BY p.nombre DESC")
    List<Portafolio> findAllPortafolioByNombreDesc();
    
}
