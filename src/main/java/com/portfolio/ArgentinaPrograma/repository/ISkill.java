
package com.portfolio.ArgentinaPrograma.repository;
import com.portfolio.ArgentinaPrograma.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkill extends JpaRepository<Skill, Integer>{
    
}
