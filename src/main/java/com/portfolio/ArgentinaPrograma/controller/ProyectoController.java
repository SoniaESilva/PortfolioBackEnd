
package com.portfolio.ArgentinaPrograma.controller;
import com.portfolio.ArgentinaPrograma.model.Proyecto;
import com.portfolio.ArgentinaPrograma.service.IProyectoService;
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
@RequestMapping("proyecto")
@CrossOrigin(origins= "https://portfolio-frontend-sonia.web.app/index")
public class ProyectoController {
    @Autowired
    private IProyectoService interProyec;
    
    @GetMapping("/lista")
    public List<Proyecto>getProyectos(){
        return interProyec.getProyecto();
    }  
    @GetMapping("/ver/{id}")
    public Proyecto findProyecto(@PathVariable Integer id){
       return interProyec.findProyecto(id);
   }
    @PostMapping("/crear")
    public void createProyec(@RequestBody Proyecto proyec){
        interProyec.saveProyecto(proyec);
    }
   
    @DeleteMapping("/borrar/{id}")
    public void deleteProyec(@PathVariable Integer id){
        interProyec.deleteProyecto(id);
     }
    
    @PutMapping("/editar")
    public void editProyec(@RequestBody Proyecto proyec){
        interProyec.saveProyecto(proyec);
    }
}
    

