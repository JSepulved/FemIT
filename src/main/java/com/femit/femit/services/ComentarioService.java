package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.Comentario;
import com.femit.femit.repositories.ComentarioRepository;

@Service
@Transactional
public class ComentarioService {
    private ComentarioRepository comentarioRepository;

    public ComentarioService(ComentarioRepository comentarioRepository){
        this.comentarioRepository = comentarioRepository;
    }

    public void saveComentario(Comentario comentario){
        this.comentarioRepository.save(comentario);
    }

    public void updateComentario(Comentario comentario){
        this.comentarioRepository.save(comentario);
    }

    public void deleteByIdComentario(Integer id){
        this.comentarioRepository.deleteById(id);
    }

    public List<Comentario> findAll(){
        return comentarioRepository.findAll();
    }

    public List<Comentario> findAllCommitByDate(){
        return comentarioRepository.findAllCommitByDateAsc();
    }
}
