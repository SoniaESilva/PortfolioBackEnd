
package com.portfolio.ArgentinaPrograma.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Proyecto {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String fecha;
    private String foto;
    private String descripcion;
    private String url;

    @Column(name="persona_id")
    private Long personaId;
    
    public Proyecto() {
    }

    public Proyecto(String nombre, String fecha, String foto, String descripcion, String url, Long personaId) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.foto = foto;
        this.descripcion = descripcion;
        this.url = url;
        this.personaId = personaId;
    }

  }
