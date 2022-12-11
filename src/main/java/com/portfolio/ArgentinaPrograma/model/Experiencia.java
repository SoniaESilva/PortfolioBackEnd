
package com.portfolio.ArgentinaPrograma.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name="experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String puesto;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private String logo;
    private String empresa;
    private boolean esTrabajoActual;
    
    @Column(name="persona_id")
    private Long personaId;

    public Experiencia() {
    }

    public Experiencia(String puesto, String fechaInicio, String fechaFin, String descripcion, String logo, String empresa, boolean esTrabajoActual, Long personaId) {
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.logo = logo;
        this.empresa = empresa;
        this.esTrabajoActual = esTrabajoActual;
        this.personaId = personaId;
    }

    
   
    
    
    
}
