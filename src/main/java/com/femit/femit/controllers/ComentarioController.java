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

import com.femit.femit.models.Comentario;
import com.femit.femit.services.ComentarioService;

@Controller
@CrossOrigin("*")
@RestController
public class ComentarioController {
    private ComentarioService comentarioService;

    public ComentarioController(@Autowired ComentarioService comentarioService){
        this.comentarioService = comentarioService;
    }

    @PostMapping("/comentario/save")
    public void saveComentario(@RequestBody Comentario comentario){
        comentarioService.saveComentario(comentario);
    }

    @PutMapping("/comentario/save")
    public void updateComentario(@RequestBody Comentario comentario){
        comentarioService.updateComentario(comentario);
    }

    @DeleteMapping("/comentario/delete/{id}")
    public void deleteByIdComentario(@PathVariable Integer id){
        comentarioService.deleteByIdComentario(id);
    }

    @GetMapping("/comentario/findall")
    public List<Comentario> findAll(){
        return comentarioService.findAll();
    }
    @GetMapping("/comentario/findallcommitbydate")
    public List<Comentario> findAllCommitByDateAsc(){
        return comentarioService.findAllCommitByDate();
    }
}
