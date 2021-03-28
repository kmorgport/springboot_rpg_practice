package com.codeup.springboot_rpg_practice.controllers;

import com.codeup.springboot_rpg_practice.repo.MonsterRepository;
import org.springframework.stereotype.Controller;

@Controller
class MonsterController {

    private final MonsterRepository monsterDao;

    public MonsterController(MonsterRepository monsterDao){
        this.monsterDao = monsterDao;
    }

}
