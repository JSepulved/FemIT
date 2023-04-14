package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.ComentarioReaccion;
import com.femit.femit.repositories.ComentarioReaccionRepository;

@Service
@Transactional
public class ComentarioReaccionService {
    private ComentarioReaccionRepository comentarioReaccionRepository;

    public ComentarioReaccionService(ComentarioReaccionRepository comentarioReaccionRepository){
        this.comentarioReaccionRepository = comentarioReaccionRepository;
    }

    public void saveComentarioReaccion(ComentarioReaccion comentarioReaccion){
        this.comentarioReaccionRepository.save(comentarioReaccion);
    }

    public ComentarioReaccion updateComentarioReaccion(ComentarioReaccion comentarioReaccion){
        return comentarioReaccionRepository.save(comentarioReaccion);
    }

    public void deleteComentarioReaccionById(Integer id){
        this.comentarioReaccionRepository.deleteById(id);
    }

    public List<ComentarioReaccion> findAll(){
        return comentarioReaccionRepository.findAll();
    }

    
}
