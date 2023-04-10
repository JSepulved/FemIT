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
        return this.publicacionRepository.findAll();
    }

    public Publicacion findById(Integer id) {
        return this.publicacionRepository.findById(id).orElse(null);
    }

    public List<Publicacion> findPublicacionByUserId(Integer idUsuario) {
        return this.publicacionRepository.findPublicacionByUserId(idUsuario);
    }

    public List<Publicacion> findPublicacionByEmpresaId(Integer idEmpresa) {
        return this.publicacionRepository.findPublicacionByEmpresaId(idEmpresa);
    }
}
