package com.femit.femit.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.femit.femit.models.Publicacion;
import com.femit.femit.services.PublicacionService;

@Controller
@CrossOrigin("*")
@RestController
public class PublicacionController {
    private PublicacionService publicacionService;

    public PublicacionController(@Autowired PublicacionService publicacionService) {
        this.publicacionService = publicacionService;
    }

    @PostMapping("/publicacion/save")
    public void savePublicacion(@RequestBody Publicacion publicacion) {
        publicacion.setFecha_hora_publicacion(LocalDateTime.now());
        publicacionService.savePublicacion(publicacion);
    }

    @PutMapping("/publicacion/update/{id}")
    public void updatePublicacion(@PathVariable Integer id, @RequestBody Publicacion publicacion) {
        Publicacion oldPublicacion = publicacionService.findById(id);
        if (oldPublicacion != null) {
            publicacion.setId_publicacion(id);
            publicacion.setFecha_hora_publicacion(oldPublicacion.getFecha_hora_publicacion());
            publicacionService.updatePublicacion(publicacion);
        }
    }

    @DeleteMapping("/publicacion/delete/{id}")
    public void deletePublicacionById(@PathVariable Integer id) {
        publicacionService.deleteByIdPublicacion(id);
    }

    @GetMapping("/publicacion/findall")
    public List<Publicacion> findAllPublicacion() {
        return publicacionService.findAll();
    }

    @GetMapping("/publicacion/findbyid/{id}")
    public Publicacion findPublicacionById(@PathVariable Integer id) {
        return publicacionService.findById(id);
    }

    @GetMapping("/publicacion/findbyuserid/{idUsuario}")
    public List<Publicacion> findPublicacionByUserId(@PathVariable Integer idUsuario) {
        return publicacionService.findPublicacionByUserId(idUsuario);
    }

    @GetMapping("/publicacion/findbyempresaid/{idEmpresa}")
    public List<Publicacion> findPublicacionByEmpresaId(@PathVariable Integer idEmpresa) {
        return publicacionService.findPublicacionByEmpresaId(idEmpresa);
    }
}
