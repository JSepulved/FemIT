package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.femit.femit.models.PublicacionReaccion;

public interface PublicacionReaccionRepository extends JpaRepository<PublicacionReaccion, Integer> {
    // List<PublicacionReaccion> findByPublicacionId(Integer publicacionId);
}
