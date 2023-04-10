package com.femit.femit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name= "publicacionReaccion")
public class PublicacionReaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_publicacionReaccion;
    private Integer id_publicacion;
    private Integer id_reaccion;
    
   
}

