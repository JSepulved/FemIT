package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.Mensaje;
import com.femit.femit.repositories.MensajeRepository;

@Service
@Transactional
public class MensajeService {
    private MensajeRepository mensajeRepository;
    public MensajeService (MensajeRepository mensajeRepository){
        this.mensajeRepository = mensajeRepository;
    }

    public void saveMensaje(Mensaje mensaje){
        this.mensajeRepository.save(mensaje);
    }

    public void updateMensaje(Mensaje mensaje){
        this.mensajeRepository.save(mensaje);
    }

    public void deleteByIdMensaje(Integer id){
        this.mensajeRepository.deleteById(id);
    }

    public List<Mensaje> findAll(){
        return mensajeRepository.findAll();
    }

    public List<Mensaje> findAllMensajeByNombreAsc(){
        return mensajeRepository.findAllMensajeByNombreAsc();
    }

    public List<Mensaje> findAllMensajeByNombreDesc(){
        return mensajeRepository.findAllMensajeByNombreDesc();
    }


}
