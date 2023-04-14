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

import com.femit.femit.models.Portafolio;
import com.femit.femit.services.PortafolioService;

@Controller
@CrossOrigin("*")
@RestController
//hola
public class PortafolioController {
    private PortafolioService portafolioService;

    public PortafolioController(@Autowired PortafolioService portafolioService){
        this.portafolioService = portafolioService;
    }

    @PostMapping("/portafolio/save")
    public void savePortafolio(@RequestBody Portafolio portafolio){
        portafolioService.savePortafolio(portafolio);
    }

    @PutMapping("/portafolio/update")
    public void updatePortafolio(@RequestBody Portafolio portafolio){
        portafolioService.updatePortafolio(portafolio);
    }

    @DeleteMapping("/portafolio/delete/{id}")
    public void deletePortafolioById(@PathVariable Integer id){
        portafolioService.deletePortafolioById(id);
    }

    @GetMapping("/portafolio/findall")
    public List<Portafolio> findAll(){
        return portafolioService.findAll();
    }

    @GetMapping("/portafolio/findallportafoliobyidusuarioasc")
    public List<Portafolio> findAllPortafolioByIdUsuarioAsc(){
        return portafolioService.findAllPortafolioByIdUsuarioAsc();
    }

    @GetMapping("/portafolio/findallportafoliobyidusuariodesc")
    public List<Portafolio> findAllPortafolioByIdUsuarioDesc(){
        return portafolioService.findAllPortafolioByIdUsuarioDesc();
    }
}
