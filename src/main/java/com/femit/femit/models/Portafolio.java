package com.femit.femit.models;



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
@Entity(name="portafolio")
public class Portafolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_portafolio;
    private Integer id_usuario;
    
    // @OneToMany(mappedBy = "portafolio")
    // private List<Proyecto> proyectos;
    
    
    // // Métodos adicionales
    // public void addProyecto(Proyecto proyecto) {
    //     proyectos.add(proyecto);
    //     proyecto.setId_portafolio(id_portafolio);
    // }
    
    // public void removeProyecto(Proyecto proyecto) {
    //     proyectos.remove(proyecto);
    //     proyecto.setId_portafolio(null);
    // }
}