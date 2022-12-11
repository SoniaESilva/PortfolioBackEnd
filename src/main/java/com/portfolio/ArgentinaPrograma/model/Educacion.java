
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
  @Table (name="educacion")
    public class Educacion {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String establecimiento;
    private String titulo;
    private String fechaInicio;
    private String fechaFin;
    private String logo;
    private boolean esEstudioActual;
    
    @Column(name="persona_id")
    private Long personaId;

    public Educacion() {
    }

    public Educacion(String establecimiento, String titulo, String fechaInicio, String fechaFin, String logo, boolean esEstudioActual, Long personaId) {
        this.establecimiento = establecimiento;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.logo = logo;
        this.esEstudioActual = esEstudioActual;
        this.personaId = personaId;
    }
    
    
    
}
