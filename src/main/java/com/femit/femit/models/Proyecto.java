package com.femit.femit.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_proyecto;
    private Integer id_portafolio;
    private String nombre_proyecto;
    private LocalDate fecha_inicio;
    private LocalDate fecha_termino;
    private String imagen_referencia;
    private String descripcion;
    private String colaboradores;
    private String tecnologias;
    private String enlace_codigo;
    private String enlace_proyecto;
    private String categoria;
}
