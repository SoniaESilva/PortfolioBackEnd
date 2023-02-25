
package com.portfolio.ArgentinaPrograma.controller;
import com.portfolio.ArgentinaPrograma.model.Experiencia;
import com.portfolio.ArgentinaPrograma.service.IExperienciaService;
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
@RequestMapping("experiencia")
@CrossOrigin(origins= "https://portfolio-frontend-sonia.web.app/index")
public class ExperienciaController {
     @Autowired
    private IExperienciaService interExp;
     
    @GetMapping("/lista")
    public List<Experiencia>getExperiencias(){
        return interExp.getExperiencias();
    }
    
   @GetMapping("/ver/{id}")
    public Experiencia findExperiencia(@PathVariable Integer id){
       return interExp.findExperiencia(id);
   }
     @PostMapping("/crear")
    public void createExp(@RequestBody Experiencia exp){
        interExp.saveExperiencia(exp);
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteExp(@PathVariable ("id")Integer id){
        interExp.deleteExperiencia(id);
     }
    
    @PutMapping("/editar")
    public void editExp(@RequestBody Experiencia exp){
        interExp.saveExperiencia(exp);
    }
    
    }
   