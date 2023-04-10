package com.femit.femit.controllers;

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

import com.femit.femit.models.PublicacionReaccion;
import com.femit.femit.services.PublicacionReaccionService;

@Controller
@CrossOrigin("*")
@RestController
public class PublicacionReaccionController {
    private PublicacionReaccionService publicacionReaccionService;

    public PublicacionReaccionController(@Autowired PublicacionReaccionService publicacionReaccionService){
        this.publicacionReaccionService = publicacionReaccionService;
    }

    @PostMapping("/publicacionreaccion/save")
    public void savePublicacionReaccion(@RequestBody PublicacionReaccion publicacionReaccion){
        publicacionReaccionService.savePublicacionReaccion(publicacionReaccion);
    }

    @PutMapping("/publicacionreaccion/save")
    public void updatePublicacionReaccion(@RequestBody PublicacionReaccion publicacionReaccion){
        publicacionReaccionService.savePublicacionReaccion(publicacionReaccion);
    }

    @DeleteMapping("/publicacionreaccion/delete/{id}")
    public void deleteByIdPublicacionReaccion(@PathVariable Integer id){
        publicacionReaccionService.deleteById(id);
    }

    @GetMapping("/publicacionreaccion/findall")
    public List<PublicacionReaccion> findAll(){
        return publicacionReaccionService.findAll();
    }
}
