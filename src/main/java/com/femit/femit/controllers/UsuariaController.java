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

import com.femit.femit.models.Usuaria;
import com.femit.femit.services.UsuariaService;

@Controller
@CrossOrigin("*")
@RestController
public class UsuariaController {
  private UsuariaService usuariaService;

  public UsuariaController(@Autowired UsuariaService usuariaService){
    this.usuariaService = usuariaService;
  }

  @PostMapping("/usuaria/save")
  public void saveUsuaria(@RequestBody Usuaria usuaria){
    usuariaService.saveUsuaria(usuaria);
  }

  @PutMapping("/usuaria/update")
  public void updateUsuaria(@RequestBody Usuaria usuaria){
    usuariaService.updateUsuaria(usuaria);
  }

  @DeleteMapping("/usuaria/delete/{id}")
  public void deleteByIdUsuaria(@PathVariable Integer id){
    usuariaService.deleteByIdUsuaria(id);
  }

  @GetMapping("/usuaria/findall")
  public List<Usuaria> findAllUsuaria(){
    return usuariaService.findAll();
  }

  @GetMapping("/usuaria/findallbynombreasc")
  public List<Usuaria> findAllByNombreAsc(){
    return usuariaService.findAllUsuariaByNombreAsc();
  }

  @GetMapping("/usuaria/findallbynombredesc")
  public List<Usuaria> findAllByNombreDesc(){
    return usuariaService.findAllUsuariaByNombreDesc();
  }
}
