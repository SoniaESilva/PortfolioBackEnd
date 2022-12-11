
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Skill;
import com.portfolio.ArgentinaPrograma.repository.ISkill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillService implements ISkillService{

     @Autowired
    private ISkill skillRepository;
    
    @Override //ver lista de skills
    public List<Skill> getSkill() {
        List<Skill> listaSkill =skillRepository.findAll();
        return listaSkill;
    }

    @Override //crear o modificar skills
    public void saveSkill(Skill ski) {
       skillRepository.save(ski);
    }
    @Override // borrar skills
    public void deleteSkill(Integer id){
        skillRepository.deleteById(id);
    }

    @Override //traer la skill
    public Skill findSkill(Integer id) {
       Skill ski =skillRepository.findById(id).orElse(null);
        return ski;
    }
    
    
}
