package com.femit.femit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.femit.femit.models.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
    @Query(value = "SELECT * FROM comentario ORDER BY fecha_hora_comentario ASC", nativeQuery = true)
    List<Comentario> findAllCommitByDateAsc();
}
