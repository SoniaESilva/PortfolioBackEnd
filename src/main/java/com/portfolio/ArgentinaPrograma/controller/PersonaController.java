
package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.Persona;
import com.portfolio.ArgentinaPrograma.service.IPersonaService;
import com.portfolio.ArgentinaPrograma.service.PersonaDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins= "https://portfolio-sonia.web.app/")
public class PersonaController {
    @Autowired
    private IPersonaService interPersona;
   
    @GetMapping("/lista")
    public List<Persona>getPersonas(){
        return interPersona.getPersonas();
    }
    @GetMapping("/ver/{id}")
     public Persona findPersona(@PathVariable Long id){
          return interPersona.findPersona(id);
    }
    @PostMapping("/crear")
    public void createperso(@RequestBody Persona persos){
        interPersona.savePersona(persos);
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
    }
    
    @PutMapping("/editar")
    public void editPersona(@RequestBody Persona persos){
        interPersona.savePersona(persos);
    }
    @PostMapping("/login")
    public PersonaDTO loginPersona(@RequestBody Persona persos){
        return interPersona.loginPersona(persos.getCorreo(), persos.getContrasenia());
    }
    
    }
    
    
   
    
    

