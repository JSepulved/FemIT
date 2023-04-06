package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.Usuaria;
import com.femit.femit.repositories.UsuariaRepository;

@Service
@Transactional
public class UsuariaService {
  private UsuariaRepository usuariaRepository;

  public UsuariaService(UsuariaRepository usuariaRepository){
    this.usuariaRepository = usuariaRepository;
  }

  public void saveUsuaria(Usuaria usuaria){
    this.usuariaRepository.save(usuaria);
  }

  public void updateUsuaria(Usuaria usuaria){
    this.usuariaRepository.save(usuaria);
  }

  public void deleteByIdUsuaria(Integer id){
    this.usuariaRepository.deleteById(id);
  }

  public List<Usuaria> findAll(){
    return usuariaRepository.findAll();
  }

  public List<Usuaria> findAllUsuariaByNombreAsc(){
    return usuariaRepository.findAllUsuariaByNombreAsc();
  }

  public List<Usuaria> findAllUsuariaByNombreDesc(){
    return usuariaRepository.findAllUsuariaByNombreDesc();
  }
}
