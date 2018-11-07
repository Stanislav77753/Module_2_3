package com.popovich.view;

import com.popovich.controller.SkillController;
import com.popovich.model.Skill;

import java.util.Scanner;

public class SkillView {
    private SkillController skillController = new SkillController();
    private Scanner scanner = new Scanner(System.in);

    public void addSkill(){
        skillController.save(new Skill(getNameSkill()));
    }

    private String getNameSkill(){
        String result = scanner.nextLine().toLowerCase().trim();
        return result;
    }
}
