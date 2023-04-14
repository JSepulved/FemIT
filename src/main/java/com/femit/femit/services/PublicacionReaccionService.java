package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.PublicacionReaccion;
import com.femit.femit.repositories.PublicacionReaccionRepository;

@Service
@Transactional
public class PublicacionReaccionService {
    private PublicacionReaccionRepository publicacionReaccionRepository;

    public PublicacionReaccionService(PublicacionReaccionRepository publicacionReaccionRepository) {
        this.publicacionReaccionRepository = publicacionReaccionRepository;
    }

    public void savePublicacionReaccion(PublicacionReaccion publicacionReaccion) {
        this.publicacionReaccionRepository.save(publicacionReaccion);
    }

    public void updatePublicacionReaccion(PublicacionReaccion publicacionReaccion) {
        this.publicacionReaccionRepository.save(publicacionReaccion);
    }

    public void deleteById(Integer id) {
        this.publicacionReaccionRepository.deleteById(id);
    }

    public List<PublicacionReaccion> findAll() {
        return publicacionReaccionRepository.findAll();
    }

    // public List<PublicacionReaccion> findByPublicacionId(Integer publicacionId) {
    //     return publicacionReaccionRepository.findByPublicacionId(publicacionId);
    // }
    
}
