package com.femit.femit.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="comentario")
public class Comentario {
    private Integer id_comentario;
    private Integer id_publicacion;
    private Integer id_usuario;
    private LocalDateTime fecha_hora_comentario;
    private String contenido_comentario;
    private Integer id_empresa;

}
