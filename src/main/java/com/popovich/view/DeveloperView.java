package com.popovich.view;

import com.popovich.controller.AccountController;
import com.popovich.controller.DeveloperController;
import com.popovich.model.Account;
import com.popovich.model.Developer;
import com.popovich.model.Skill;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeveloperView {
    private AccountView accountView = new AccountView();
    private Scanner scanner = new Scanner(System.in);
    private DeveloperController developerController = new DeveloperController();
    private AccountController accountController = new AccountController();

    public void addDeveloper(){
        Developer developer = new Developer(getName("firstName"), getName("lastName"),
                getName("speciality"));
        Account account = new Account(getName("accountData"));
        developer.setAccount(account);
        developerController.save(developer);
        accountController.save(account);
    }

    public void addSkills(){
        Developer developer = new Developer(getName("firstName"), getName("lastName"),
                getName("speciality"));
        developer.setId(1L);
        Skill skill = new Skill(getName("skill"));
        skill.setId(1L);
        Skill skill2= new Skill(getName("skill"));
        skill.setId(7L);
        Set<Skill> skills = new HashSet<>();
        skills.add(skill);
        skills.add(skill2);
        developer.setSkills(skills);
        developerController.update(developer);
    }

    public String getName(String name){
        String result = new String();
        switch (name){
            case ("firstName"):
                System.out.println("Enter first name");
                result = scanner.nextLine().toLowerCase().trim();
                break;
            case ("lastName"):
                System.out.println("Enter last name");
                result = scanner.nextLine().toLowerCase().trim();
                break;
            case ("speciality"):
                System.out.println("Enter speciality");
                result = scanner.nextLine().toLowerCase().trim();
                break;
            case ("accountData"):
                System.out.println("Enter accountData");
                result = scanner.nextLine().toLowerCase().trim();
                break;
            case ("skill"):
                System.out.println("Enter skill");
                result = scanner.nextLine().toLowerCase().trim();

        }
        return result;
    }
}
