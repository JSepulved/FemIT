package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.Proyecto;
import com.femit.femit.repositories.ProyectoRespository;

@Service
@Transactional
public class ProyectoService {
    private ProyectoRespository proyectoRepository;

    public ProyectoService(ProyectoRespository proyectoRepository){
        this.proyectoRepository = proyectoRepository;
    }

    public void saveProyecto(Proyecto proyecto){
        this.proyectoRepository.save(proyecto);
    }

    public void updateProyecto(Proyecto proyecto){
        this.proyectoRepository.save(proyecto);
    }

    public void deleteByIdProyecto(Integer id){
        this.proyectoRepository.deleteById(id);
    }

    public List<Proyecto> findAll(){
        return proyectoRepository.findAll();
    }

    public List<Proyecto> findAllProjectByDate(){
        return proyectoRepository.findAllProjectByNameAsc();
    }
}
