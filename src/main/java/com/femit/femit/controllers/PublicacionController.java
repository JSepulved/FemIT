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
        publicacionService.savePublicacion(publicacion);
    }

    @PutMapping("/publicacion/update")
    public void updatePublicacion(@RequestBody Publicacion publicacion) {
      publicacionService.updatePublicacion(publicacion);    
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

    @GetMapping("/publicacion/findallpublicacionbyfechahoraasc")
    public List<Publicacion> findAllPublicacionByFechaHoraAsc() {
        return publicacionService.findAllPublicacionByFechaHoraAsc();
    }

    @GetMapping("/publicacion/findallpublicacionbyfechahoradesc")
    public List<Publicacion> findAllPublicacionByFechaHoraDesc() {
        return publicacionService.findAllPublicacionByFechaHoraDesc();
    }


  

  

  

  
}
