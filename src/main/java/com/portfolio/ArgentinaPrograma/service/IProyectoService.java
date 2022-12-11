
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto>getProyecto();
    public void saveProyecto(Proyecto proyec);
    public void deleteProyecto(Integer id);
    public Proyecto findProyecto(Integer id);
}
