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

import com.femit.femit.models.Contacto;
import com.femit.femit.services.ContactoService;

@Controller
@CrossOrigin("*")
@RestController
public class ContactoController {
    //private Contacto contacto;
    private ContactoService contactoService;

    public ContactoController(@Autowired ContactoService contactoService){
        this.contactoService = contactoService;
    }
    
    @PostMapping("/contacto/save")
    public void saveContacto(@RequestBody Contacto contacto){
        contactoService.saveContacto(contacto);
    }

    @PutMapping("/contacto/update")
    public void updateContacto(@RequestBody Contacto contacto){
        contactoService.updateContacto(contacto);
    }

    @DeleteMapping("/contacto/delete/{id}")
    public void deleteByIdContacto(@PathVariable Integer id){
        contactoService.deleteByIdContacto(id);
    }

    @GetMapping("/contacto/findall")
    public List<Contacto> findAllContacto(){
        return contactoService.findAll();
    }

    @GetMapping("/contacto/findallbynombreasc")
    public List<Contacto> findAllByNombreAsc(){
        return contactoService.findAllContactoByNombreAsc();
    }

    @GetMapping("/contacto/findallbynombredesc")
    public List<Contacto> findAllByNombreDesc(){
        return contactoService.findAllContactoByNombreDesc();
    }

}
