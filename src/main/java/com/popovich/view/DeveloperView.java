package com.popovich.view;

import com.popovich.controller.AccountController;
import com.popovich.controller.DeveloperController;
import com.popovich.controller.SkillController;
import com.popovich.exceptions.EntityNotExistsException;
import com.popovich.model.Account;
import com.popovich.model.Developer;
import com.popovich.model.Skill;
import java.util.List;
import java.util.Scanner;

public class DeveloperView {
    private Scanner scanner = new Scanner(System.in);
    private DeveloperController developerController = new DeveloperController();
    private AccountController accountController = new AccountController();
    private SkillController skillController = new SkillController();

    public void addDeveloper(){
        Developer developer = new Developer(getName("firstName"), getName("lastName"),
                getName("speciality"));
        Account account = new Account(getName("accountData"));
        developer.setAccount(account);
        developerController.save(developer);
        accountController.save(account);
    }

    public void addSkills(){
        Developer developer = null;
        try {
            developer = getDeveloper();
            getSkills(developer);
        } catch (EntityNotExistsException e) {
            System.out.println(e);
        }
        developerController.update(developer);
    }

    public void deleteDeveloper(){
        Developer developer = null;
        Account account = null;
        try {
            developer = getDeveloper();
            account = developer.getAccount();
            developerController.delete(developer);
            accountController.delete(account);
        } catch (EntityNotExistsException e) {
            System.out.println(e);
        }
    }

    private Developer getDeveloper() throws EntityNotExistsException {
        String firstName = getName("firstName");
        String lastName = getName("lastName");
        List<Developer> allDevelopers = developerController.getAll();
        for(Developer developer: allDevelopers){
            if(developer.getFirstName().equals(firstName) && developer.getLastName().equals(lastName)){
                return developer;
            }
        }
        throw new EntityNotExistsException("This developer not exists in database");
    }

    private void getSkills(Developer developer){
            do{
            String skill = getName("skill");
            if(skill.equals("cancel")){
                break;
            }
            try {
                Skill skillFromDB = checkSkill(skill);
                developer.addSkill(skillFromDB);
            } catch (EntityNotExistsException e) {
                System.out.println(e);
            }
        }while(true);
    }

    private Skill checkSkill(String skill) throws EntityNotExistsException {
        List<Skill> allSkills = skillController.getAll();
        for(Skill skills: allSkills){
            if(skills.getSkillName().equals(skill)){
                return skills;
            }
        }
        throw new EntityNotExistsException("This skill not exists in database");
    }

    private String getName(String name){
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
