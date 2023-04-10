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

import com.femit.femit.models.ComentarioReaccion;
import com.femit.femit.services.ComentarioReaccionService;

@Controller
@CrossOrigin("*")
@RestController
public class ComentarioReaccionController {

    private ComentarioReaccionService comentarioReaccionService;

    public ComentarioReaccionController(@Autowired ComentarioReaccionService comentarioReaccionService){
        this.comentarioReaccionService = comentarioReaccionService;
    }

    @PostMapping("/comentarioreaccion/save")
    public void saveComentarioReaccion(@RequestBody ComentarioReaccion comentarioReaccion){
        comentarioReaccionService.saveComentarioReaccion(comentarioReaccion);
    }

    @PutMapping("/comentarioreaccion/save")
    public void updateComentarioReaccion(@RequestBody ComentarioReaccion comentarioReaccion){
        comentarioReaccionService.saveComentarioReaccion(comentarioReaccion);
    }

    @DeleteMapping("/comentarioreaccion/delete/{id}")
    public void deleteComentarioReaccionById(@PathVariable Integer id){
        comentarioReaccionService.deleteComentarioReaccionById(id);
    }

    @GetMapping("/comentarioreaccion/findall")
    public List<ComentarioReaccion> findAllComentarioReacciones(){
        return comentarioReaccionService.findAllComentarioReacciones();
    }
}
