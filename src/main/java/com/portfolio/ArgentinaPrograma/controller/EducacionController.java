
package com.portfolio.ArgentinaPrograma.controller;
import com.portfolio.ArgentinaPrograma.model.Educacion;
import com.portfolio.ArgentinaPrograma.service.IEducacionService;
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
@RequestMapping("educacion")
@CrossOrigin(origins= "https://portfolio-frontend-sonia-b1f4a.web.app/index")
public class EducacionController {
    @Autowired
    private IEducacionService interEdu;
    
    @GetMapping("/lista")
    public List<Educacion>getEducacion(){
        return interEdu.getEducacion();
    }
    @GetMapping("/ver/{id}")
    public Educacion findEducacion(@PathVariable Integer id){
       return interEdu.findEducacion(id);
   }
    @PostMapping("/crear")
    public void createEdu(@RequestBody Educacion edu){
        interEdu.saveEducacion(edu);
    }
    @DeleteMapping("/borrar/{id}")
    public void deleteEdu(@PathVariable Integer id){
        interEdu.deleteEducacion(id);
    }
    @PutMapping("/editar")
    public void editEdu(@RequestBody Educacion edu){
        interEdu.saveEducacion(edu);
    }
    
    }
    
