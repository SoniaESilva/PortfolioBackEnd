
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
@Table (name="skill")
public class Skill {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String nombreHabilidad;
    private String porcentaje;

    @Column(name="persona_id")
    private Long personaId;
    
    public Skill() {
    }

    public Skill(String nombreHabilidad, String porcentaje, Long personaId) {
        this.nombreHabilidad = nombreHabilidad;
        this.porcentaje = porcentaje;
        this.personaId = personaId;
    }

  
    
    
}
