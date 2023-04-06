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

import com.femit.femit.models.Proyecto;
import com.femit.femit.services.ProyectoService;

@Controller
@CrossOrigin("*")
@RestController
public class ProyectoController {
    private ProyectoService proyectoService;

    public ProyectoController(@Autowired ProyectoService proyectoService){
        this.proyectoService = proyectoService;
    }

    @PostMapping("/proyecto/save")
    public void saveProyecto(@RequestBody Proyecto proyecto){
        proyectoService.saveProyecto(proyecto);
    }

    @PutMapping("/proyecto/save")
    public void updateProyecto(@RequestBody Proyecto proyecto){
        proyectoService.updateProyecto(proyecto);
    }

    @DeleteMapping("/proyecto/delete/{id}")
    public void deleteByIdProyecto(@PathVariable Integer id){
        proyectoService.deleteByIdProyecto(id);
    }

    @GetMapping("/proyecto/findall")
    public List<Proyecto> findAll(){
        return proyectoService.findAll();
    }
    @GetMapping("/proyecto/findallprojectbydate")
    public List<Proyecto> findAllProjectByNameAsc(){
        return proyectoService.findAllProjectByDate();
    }
}
