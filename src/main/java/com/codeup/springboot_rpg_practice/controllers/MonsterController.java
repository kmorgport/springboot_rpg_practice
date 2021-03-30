package com.codeup.springboot_rpg_practice.controllers;

import com.codeup.springboot_rpg_practice.models.Monster;
import com.codeup.springboot_rpg_practice.repo.MonsterRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
class MonsterController {

    private final MonsterRepository monsterDao;

    public MonsterController(MonsterRepository monsterDao){
        this.monsterDao = monsterDao;
    }

    @GetMapping("/monsters/show")
    public String posts(Model model){
        List<Monster> monsterFromDB = monsterDao.findAll();
        model.addAttribute("monsters",monsterFromDB);
        return "monsters/show";
    }

    @GetMapping("/monsters/create")
    public String viewCreate(Model model) {
        model.addAttribute("monster",new Monster());
        return "monsters/create";
    }

    @PostMapping("/monsters/create")
    @ResponseBody
    public String createPost(@ModelAttribute Monster monster) {
        monsterDao.save(monster);
        return "a new monster";
    }

}
