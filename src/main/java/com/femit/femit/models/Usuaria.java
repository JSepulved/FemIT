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
@Entity(name="usuario")
public class Usuaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    private String nombre;
    private String apellidos;
    private LocalDate fecha_nacimiento;
    private String correo_electronico;
    private String contrasena;
    private String foto_portada;
    private String foto_perfil;
    private String cargo;
    private String estudios;
    private Boolean buscando_empleo;
    private String curriculum;
    private String links;
    private String rol_usuario;



}
