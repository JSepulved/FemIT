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

import com.femit.femit.models.Mensaje;
import com.femit.femit.services.MensajeService;

@Controller
@CrossOrigin("*")
@RestController
public class MensajeController {
    //private Mensaje mensaje;
    private MensajeService mensajeService;
    public MensajeController(@Autowired MensajeService mensajeService){
        this.mensajeService = mensajeService;
    }
    
    @PostMapping("/mensaje/save")
    public void saveMensaje(@RequestBody Mensaje mensaje){
        mensajeService.saveMensaje(mensaje);
    }

    @PutMapping("mensaje/update")
    public void updateMensaje(@RequestBody Mensaje mensaje){
        mensajeService.updateMensaje(mensaje);
    }

    @DeleteMapping("/mensaje/delete/{id}")
    public void deleteByIdMensaje(@PathVariable Integer id){
        mensajeService.deleteByIdMensaje(id);
    }

    @GetMapping("/mensaje/findall")
    public List<Mensaje> findAllMensaje(){
        return mensajeService.findAll();
    }

    @GetMapping("/mensaje/findallbynombreasc")
    public List<Mensaje> findAllByNombreAsc(){
        return mensajeService.findAllMensajeByNombreAsc();
    }

    @GetMapping("/mensaje/findallbynombredesc")
    public List<Mensaje> findAllByNombreDesc(){
        return mensajeService.findAllMensajeByNombreDesc();
    }


}
