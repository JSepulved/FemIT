package com.femit.femit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name= "comentarioReaccion")
public class ComentarioReaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_comentarioReaccion;
    
    @ManyToOne
    private Comentario comentario;
    
    @ManyToOne
    private Reaccion reaccion;
    
    
}
