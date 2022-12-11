
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Experiencia;
import com.portfolio.ArgentinaPrograma.repository.IExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    private IExperiencia expRepository;
 

    @Override //ver lista de experiencias 
    public List<Experiencia> getExperiencias() {
       List<Experiencia> listaExperiencias =expRepository.findAll();
        return listaExperiencias;
    }

    @Override  //crear o modificar experiencia
    public void saveExperiencia(Experiencia exper) {
     expRepository.save(exper);
    }

    @Override // borrar experiencia
    public void deleteExperiencia(Integer id) {
       expRepository.deleteById(id);
    }

    @Override //traer la experiencia
    public Experiencia findExperiencia(Integer id) {
      Experiencia exper=expRepository.findById(id).orElse(null);
       return exper;
    }

   

    
    
}
