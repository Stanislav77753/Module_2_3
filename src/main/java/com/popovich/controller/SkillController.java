package com.popovich.controller;

import com.popovich.model.Skill;
import com.popovich.service.SkillService;

public class SkillController {
    private SkillService skillService = new SkillService();

    public void save(Skill skill){
        skillService.save(skill);
    }
}
