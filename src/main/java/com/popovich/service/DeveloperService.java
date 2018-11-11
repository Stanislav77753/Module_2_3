package com.popovich.service;

import com.popovich.dao.DeveloperDaoImp;
import com.popovich.model.Developer;

import java.util.List;

public class DeveloperService {
    private DeveloperDaoImp developerDaoImp = new DeveloperDaoImp();

    public void save(Developer developer){
        developerDaoImp.save(developer);
    }

    public void update(Developer developer){
        developerDaoImp.update(developer);
    }

    public List<Developer> getAll(){
        return developerDaoImp.getAll();
    }

    public void delete(Developer developer){
        developerDaoImp.delete(developer);
    }
}
