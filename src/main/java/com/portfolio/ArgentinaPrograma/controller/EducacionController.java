
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("educacion")
@CrossOrigin(origins= "http://localhost:4200")
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
    public String createEdu(@RequestBody Educacion edu){
        interEdu.saveEducacion(edu);
        return "La educación fue creada correctamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String deleteEdu(@PathVariable Integer id){
        interEdu.deleteEducacion(id);
        return "La educación fue eliminada correctamente";
    }
    @PutMapping("/editar/{id}")
    public Educacion editEducacion(@PathVariable Integer id,
                                       @RequestParam("establecimiento") String nuevoEstablecimiento,
                                       @RequestParam("titulo") String nuevaTitulo,
                                       @RequestParam("fechaInicio") String nuevaFechaInicio,
                                       @RequestParam("fechaFin") String nuevaFechaFin,
                                       @RequestParam("logo") String nuevoLogo,
                                       @RequestParam("esEstudioActual") boolean nuevoEsEstudioActual){
        Educacion edu =interEdu.findEducacion(id);
         
        edu.setEstablecimiento(nuevoEstablecimiento);
        edu.setTitulo(nuevaTitulo);
        edu.setFechaInicio(nuevaFechaInicio);
        edu.setFechaFin(nuevaFechaFin);
        edu.setLogo(nuevoLogo);
        edu.setEsEstudioActual(nuevoEsEstudioActual);
        interEdu.saveEducacion(edu);
        return edu;
    }
}
