
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Proyecto;
import com.portfolio.ArgentinaPrograma.repository.IProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    private IProyecto proyecRepository;
    
    @Override //ver lista de proyectos
    public List<Proyecto> getProyecto() {
        List<Proyecto> listaProyectos =proyecRepository.findAll();
        return listaProyectos;
    }

    @Override //crear o modificar el proyecto
    public void saveProyecto(Proyecto proyec) {
        proyecRepository.save(proyec);
    }

    @Override // borrar proyecto
    public void deleteProyecto(Integer id) {
        proyecRepository.deleteById(id);
    }

    @Override //traer el proyecto
    public Proyecto findProyecto(Integer id) {
        Proyecto proyec=proyecRepository.findById(id).orElse(null);
       return proyec;
    }
    
}
