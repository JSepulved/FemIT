package com.femit.femit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name= "publicacionTrabajo")
public class PublicacionTrabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_publicacionTrabajo;
    private Integer id_empresa;
    private String titulo;
    private String ubicacion;
    private String modalidad_trabajo;
    private Integer descripcion_empleo;
}
