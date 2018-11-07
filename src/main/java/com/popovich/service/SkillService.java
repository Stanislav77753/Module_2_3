package com.popovich.service;

import com.popovich.dao.SkillDaoImp;
import com.popovich.model.Skill;

public class SkillService {
    private SkillDaoImp skillDaoImpil = new SkillDaoImp();

    public void save(Skill skill){
        skillDaoImpil.save(skill);
    }
}
