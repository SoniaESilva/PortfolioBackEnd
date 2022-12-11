
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins= "http://localhost:4200")
public class ExperienciaController {
     @Autowired
    private IExperienciaService interExp;
     
    @GetMapping("/lista")
    public List<Experiencia>getExperiencias(){
        return interExp.getExperiencias();
    }
     @PostMapping("/crear")
    public String createExp(@RequestBody Experiencia exp){
        interExp.saveExperiencia(exp);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteExp(@PathVariable Integer id){
        interExp.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }
     @PutMapping("/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Integer id,
                                       @RequestParam("puesto") String nuevoPuesto,
                                       @RequestParam("fechaInicio") String nuevaFechaInicio,
                                       @RequestParam("fechaFin") String nuevaFechaFin,
                                       @RequestParam("descripcion") String nuevaDescripcion,
                                       @RequestParam("logo") String nuevoLogo,
                                       @RequestParam("empresa") String nuevaEmpresa,
                                       @RequestParam("esTrabajoActual") boolean nuevoEsTrabajoActual){
        Experiencia exp =interExp.findExperiencia(id);
         
        exp.setPuesto(nuevoPuesto);
        exp.setFechaInicio(nuevaFechaInicio);
        exp.setFechaFin(nuevaFechaFin);
        exp.setDescripcion(nuevaDescripcion);
        exp.setLogo(nuevoLogo);
        exp.setEmpresa(nuevaEmpresa);
        exp.setEsTrabajoActual(nuevoEsTrabajoActual);
        interExp.saveExperiencia(exp);
        return exp;
    }
}
