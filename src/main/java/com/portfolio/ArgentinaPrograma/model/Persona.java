
package com.portfolio.ArgentinaPrograma.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table (name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String banner;
    private String foto_perfil;
    private String titulo;
    private String acerca_de;
    private String correo;
    private String contrasenia;

    @OneToMany(mappedBy="personaId")
    private List<Experiencia> experiencia;
    @OneToMany(mappedBy="personaId")
    private List<Proyecto> proyecto;
    @OneToMany(mappedBy="personaId")
    private List<Skill> skills;
    @OneToMany(mappedBy="personaId")
    private List<Educacion> educacion;
    
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String banner, String foto_perfil, String titulo, String acerca_de, String correo, String contrasenia, List<Experiencia> experiencia, List<Proyecto> proyecto, List<Skill> skills, List<Educacion> educacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.banner = banner;
        this.foto_perfil = foto_perfil;
        this.titulo = titulo;
        this.acerca_de = acerca_de;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.experiencia = experiencia;
        this.proyecto = proyecto;
        this.skills = skills;
        this.educacion = educacion;
        
        experiencia = new ArrayList();
        proyecto = new ArrayList();
        skills = new ArrayList();
        educacion = new ArrayList();
    }

   

 }
    

   
    
    
    

