
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyecto")
@CrossOrigin(origins= "http://localhost:4200")
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
    public String createProyec(@RequestBody Proyecto proyec){
        interProyec.saveProyecto(proyec);
        return "El proyecto fue creado correctamente";
    }
   
    @DeleteMapping("/borrar/{id}")
    public String deleteProyec(@PathVariable Integer id){
        interProyec.deleteProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @PutMapping("/editar/{id}")
    public Proyecto editProyec(@PathVariable Integer id,
                                       @RequestParam("nombre") String nuevoNombre,
                                       @RequestParam("fecha") String nuevoFecha,
                                       @RequestParam("foto") String nuevaFoto,
                                       @RequestParam("descripcion") String nuevaDescripcion,
                                       @RequestParam("url") String nuevoUrl){
        Proyecto proyec =interProyec.findProyecto(id);
         
        proyec.setNombre(nuevoNombre);
        proyec.setFecha(nuevoFecha);
        proyec.setFoto(nuevaFoto);
        proyec.setDescripcion(nuevaDescripcion);
        proyec.setUrl(nuevoUrl);
        
        
        interProyec.saveProyecto(proyec);
        return proyec;
    }
}
