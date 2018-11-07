package com.popovich.service;

import com.popovich.dao.DeveloperDaoImp;
import com.popovich.model.Developer;

public class DeveloperService {
    private DeveloperDaoImp developerDaoImp = new DeveloperDaoImp();

    public void save(Developer developer){
        developerDaoImp.save(developer);
    }

    public void update(Developer developer){
        developerDaoImp.update(developer);
    }
}
