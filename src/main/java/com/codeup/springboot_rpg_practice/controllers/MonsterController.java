package com.codeup.springboot_rpg_practice.controllers;

import com.codeup.springboot_rpg_practice.models.Monster;
import com.codeup.springboot_rpg_practice.repo.MonsterRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
class MonsterController {

    private final MonsterRepository monsterDao;

    public MonsterController(MonsterRepository monsterDao){
        this.monsterDao = monsterDao;
    }

    @GetMapping("/monster")
    public String posts(Model model){
        List<Monster> monsterFromDB = monsterDao.findAll();
        model.addAttribute("monsters",monsterFromDB);
        return "monsters/show";
    }

}
