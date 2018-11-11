package com.popovich.service;

import com.popovich.dao.SkillDaoImp;
import com.popovich.model.Skill;

import java.util.List;

public class SkillService {
    private SkillDaoImp skillDaoImpil = new SkillDaoImp();

    public void save(Skill skill){
        skillDaoImpil.save(skill);
    }

    public List<Skill> getAll(){
        return skillDaoImpil.getAll();
    }

    public void delete(Skill skill){
        skillDaoImpil.delete(skill);
    }
}
