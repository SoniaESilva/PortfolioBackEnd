
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Persona;
import java.util.List;



public interface IPersonaService {
    public List<Persona>getPersonas();
    public void savePersona(Persona perso);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
    public Persona loginPersona(String correo, String contrasenia);
}
