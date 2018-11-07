package com.popovich.controller;

import com.popovich.model.Developer;
import com.popovich.service.DeveloperService;

public class DeveloperController {
    private DeveloperService developerService = new DeveloperService();

    public void save(Developer developer){
        developerService.save(developer);
    }

    public void update(Developer developer){
        developerService.update(developer);
    }
}
