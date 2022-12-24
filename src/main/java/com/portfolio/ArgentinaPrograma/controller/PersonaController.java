
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins= "http://localhost:4200")
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
    public String createperso(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    
    
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    @PutMapping ("/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("banner") String nuevoBanner,
                               @RequestParam("foto_perfil") String nuevaFoto_perfil,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("acerca_de") String nuevaAcerca_de,
                               @RequestParam("correo") String nuevoCorreo,
                               @RequestParam("contrasenia")String nuevaContrasenia){
        Persona perso= interPersona.findPersona(id);
        
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setBanner(nuevoBanner);
        perso.setFoto_perfil(nuevaFoto_perfil);
        perso.setTitulo(nuevoTitulo);
        perso.setAcerca_de(nuevaAcerca_de);
        perso.setCorreo(nuevoCorreo);
        perso.setContrasenia(nuevaContrasenia);
        
        
        interPersona.savePersona(perso);
        return perso;
    }
    
    @PostMapping("/login")
    public PersonaDTO loginPersona(@RequestBody Persona perso){
        return interPersona.loginPersona(perso.getCorreo(), perso.getContrasenia());
    }
    
    
}
