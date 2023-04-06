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

import com.femit.femit.models.Empresa;
import com.femit.femit.services.EmpresaService;

@Controller
@CrossOrigin("*")
@RestController
public class EmpresaController {
  //private Empresa empresa;
  private EmpresaService empresaService;

  public EmpresaController(@Autowired EmpresaService empresaService){
    this.empresaService = empresaService;
  }

  @PostMapping("/empresa/save")
  public void saveEmpresa(@RequestBody Empresa empresa){
    empresaService.saveEmpresa(empresa);
  }

  @PutMapping("/empresa/update")
  public void updateEmpresa(@RequestBody Empresa empresa){
    empresaService.updateEmpresa(empresa);
  }

  @DeleteMapping("/empresa/delete/{id}")
  public void deleteByIdEmpresa(@PathVariable Integer id){
    empresaService.deleteByIdEmpresa(id);
  }

  @GetMapping("/empresa/findall")
  public List<Empresa> findAllEmpresa(){
    return empresaService.findAll();
  }

  @GetMapping("/empresa/findallbynombreasc")
  public List<Empresa> findAllByNombreAsc(){
    return empresaService.findAllEmpresaByNombreAsc();
  }

  @GetMapping("/empresa/findallbynombredesc")
  public List<Empresa> findAllByNombreDesc(){
    return empresaService.findAllEmpresaByNombreDesc();
  }
}
