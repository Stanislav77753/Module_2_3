package com.popovich.view;

import org.hibernate.exception.ConstraintViolationException;

import java.util.Scanner;

public class ConsoleHelper {
    private DeveloperView developerView = new DeveloperView();
    private SkillView skillView = new SkillView();

    private Scanner scanner = new Scanner(System.in);

    public void start(){
        do{
            System.out.println("Enter your command");
            String command = scanner.nextLine().toLowerCase().trim();
            try{
                if(command.equals("cancel")){
                    break;
                }else if(command.equals("add skill")){
                    skillView.addSkill();
                }else if(command.equals("add developer")){
                    developerView.addDeveloper();
                }else if(command.equals("add skills for developer")){
                    developerView.addSkills();
                }
            }catch (ConstraintViolationException e){
                System.out.println("this entity already has added");
            }

        }while(true);
    }
}
