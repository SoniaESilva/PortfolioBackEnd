
package com.portfolio.ArgentinaPrograma.repository;
import com.portfolio.ArgentinaPrograma.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends JpaRepository<Persona, Long>{
     public List<Persona>findByCorreoAndContrasenia(String correo, String contrasenia);
    
}
