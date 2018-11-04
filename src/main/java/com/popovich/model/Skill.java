package com.popovich.model;

public class Skill {
    private Long id;
    private String name;

    /**
     * Default Constructor
     */

    public Skill(){
    }

    /**
     * Plain constructor
     */

    public Skill(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!this.getClass().equals(object.getClass())) {
            return false;
        }

        Skill object2 = (Skill) object;
        if ((this.id == object2.getId()) && (this.name == object2.getName())) {
            return true;
        }
        return false;
    }

    public int hasCode() {
        int code = 0;
        code = (id + name).hashCode();
        return code;
    }
}
