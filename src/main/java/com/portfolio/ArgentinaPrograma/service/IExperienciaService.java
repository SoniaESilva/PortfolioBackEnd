
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia>getExperiencias();
    public void saveExperiencia(Experiencia exper);
    public void deleteExperiencia(Integer id);
    public Experiencia findExperiencia(Integer id);
    
}
