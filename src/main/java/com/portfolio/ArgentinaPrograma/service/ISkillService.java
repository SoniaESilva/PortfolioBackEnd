
package com.portfolio.ArgentinaPrograma.service;
import com.portfolio.ArgentinaPrograma.model.Skill;
import java.util.List;


public interface ISkillService {
    public List<Skill>getSkill();
    public void saveSkill(Skill ski);
    public void deleteSkill(Integer id);
    public Skill findSkill(Integer id);
}
