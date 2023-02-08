
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion>getEducacion();
    public void saveEducacion(Educacion educ);
    public void deleteEducacion(Integer id);
    public Educacion findEducacion(Integer id);
    
}
