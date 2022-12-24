
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Persona;
import com.portfolio.ArgentinaPrograma.repository.IPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

     @Autowired
    private IPersona persoRepository;
    @Override //ver lista de personas 
    public List<Persona> getPersonas() {
         List<Persona> listaPersonas =persoRepository.findAll();
        return listaPersonas;
    }

    @Override //crear o modificar persona
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
    }

    @Override // borrar persona
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override//traer la persona 
    public Persona findPersona(Long id) {
         Persona perso =persoRepository.findById(id).orElse(null);
        return perso;
    }
     @Override
     public PersonaDTO loginPersona(String correo,  String contrasenia){
        Persona perso= persoRepository.findByCorreoAndContrasenia(correo, contrasenia);
        PersonaDTO personaDTO= new PersonaDTO (perso.getId(),perso.getNombre(),perso.getApellido(),perso.getBanner(), perso.getFoto_perfil(),perso.getTitulo(), perso.getAcerca_de());
         return personaDTO;
     }
}
