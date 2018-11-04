package com.popovich.model;
import java.util.Set;

public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
    private String speciality;
    private Set<Skill> skills;
    private Account account;

    /**
     * Default Constructor
     */
    public Developer() {
    }

    /**
     * Plain constructor
     */

    public Developer(String firstName, String lastName, String speciality, Set<Skill> skills, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.skills = skills;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
