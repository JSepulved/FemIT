package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.Empresa;
import com.femit.femit.repositories.EmpresaRepository;

@Service
@Transactional
public class EmpresaService {
  private EmpresaRepository empresaRepository;

  public EmpresaService(EmpresaRepository empresaRepository){
    this.empresaRepository = empresaRepository;
  }

  public void saveEmpresa(Empresa empresa){
    this.empresaRepository.save(empresa);
  }

  public void updateEmpresa(Empresa empresa){
    this.empresaRepository.save(empresa);
  }

  public void deleteByIdEmpresa(Integer id){
    this.empresaRepository.deleteById(id);
  }

  public List<Empresa> findAll(){
    return empresaRepository.findAll();
  }

  public List<Empresa> findAllEmpresaByNombreAsc(){
    return empresaRepository.findAllEmpresaByNombreAsc();
  }

  public List<Empresa> findAllEmpresaByNombreDesc(){
    return empresaRepository.findAllEmpresaByNombreDesc();
  }
}
