package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.Publicacion;
import com.femit.femit.repositories.PublicacionRepository;

@Service
@Transactional
public class PublicacionService {

    private PublicacionRepository publicacionRepository;

    public PublicacionService(PublicacionRepository publicacionRepository) {
        this.publicacionRepository = publicacionRepository;
    }

    public void savePublicacion(Publicacion publicacion) {
        this.publicacionRepository.save(publicacion);
    }

    public void updatePublicacion(Publicacion publicacion) {
        this.publicacionRepository.save(publicacion);
    }

    public void deleteByIdPublicacion(Integer id) {
        this.publicacionRepository.deleteById(id);
    }

    public List<Publicacion> findAll() {
        return publicacionRepository.findAll();
    }

    public Publicacion findById(Integer id) {
        return publicacionRepository.findById(id).orElse(null);
    }

    public List<Publicacion> findAllPublicacionByFechaHoraAsc() {
        return publicacionRepository.findAllPublicacionByFechaHoraAsc();
    }

    public List<Publicacion> findAllPublicacionByFechaHoraDesc() {
        return publicacionRepository.findAllPublicacionByFechaHoraDesc();
    }
}
