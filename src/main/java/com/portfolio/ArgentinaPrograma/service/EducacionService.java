
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Educacion;
import com.portfolio.ArgentinaPrograma.repository.IEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
     @Autowired
    private IEducacion eduRepository;

    @Override//ver lista de educacion
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion =eduRepository.findAll();
        return listaEducacion;
    }

    @Override //crear o modificar educacion
    public void saveEducacion(Educacion edu) {
        eduRepository.save(edu);
    }

    @Override // borrar educacion
    public void deleteEducacion(Integer id) {
       eduRepository.deleteById(id);
    }

    @Override //traer la educacion
    public Educacion findEducacion(Integer id) {
         Educacion edu=eduRepository.findById(id).orElse(null);
       return edu;
    }
     
}
