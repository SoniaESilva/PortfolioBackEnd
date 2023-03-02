
package com.portfolio.ArgentinaPrograma.controller;
import com.portfolio.ArgentinaPrograma.model.Skill;
import com.portfolio.ArgentinaPrograma.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("skill")
@CrossOrigin(origins= "https://portfolio-sonia.web.app/")
public class SkillController {
    @Autowired
    private ISkillService interSkill;
    
    @GetMapping("/lista")
    public List<Skill>getSkills(){
        return interSkill.getSkill();
    }  
    @GetMapping("/ver/{id}")
    public Skill findSkill(@PathVariable Integer id){
       return interSkill.findSkill(id);
   }
    @PostMapping("/crear")
    public void createExp(@RequestBody Skill ski){
        interSkill.saveSkill(ski);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteskill(@PathVariable Integer id){
        interSkill.deleteSkill(id);
     }
     @PutMapping("/editar")
    public void editSkill(@RequestBody Skill ski){
        interSkill.saveSkill(ski);
    }
    
   }
   

