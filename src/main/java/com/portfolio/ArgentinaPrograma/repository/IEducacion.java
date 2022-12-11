
package com.portfolio.ArgentinaPrograma.repository;
import com.portfolio.ArgentinaPrograma.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacion extends JpaRepository<Educacion, Integer>{
    
}
