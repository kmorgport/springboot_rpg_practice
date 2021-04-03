package com.codeup.springboot_rpg_practice.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "monsters")
public class Monster {

    @Id
    private long id;

    @Column(name="name",length = 225, nullable = false)
    private String name;

    @Column(name="basehp",nullable=false)
    private int baseHP;

    @Column(name="base_attack", nullable=false)
    private int baseAttack;

    @Column(name="base_defense",nullable=false)
    private int baseDefense;

    @Column(name="base_special_attack", nullable=false)
    private int baseSpecialAttack;

    @Column(name="base_special_defense",nullable=false)
    private int baseSpecialDefense;

    @Column(name="base_speed", nullable=false)
    private int baseSpeed;

    @Column(name="base_exp" ,nullable=false)
    private int baseExp;

    @Column(name="exp_group", length = 225, nullable=true)
    private String expGroup;

    @Column(name="type1" ,length = 225, nullable = false)
    private String type1;

    @Column(name="type2",length = 225)
    private String type2;

    @Column(name="level_up")
    private int levelUpLevel;

    @Column(name="next_form")
    private String nextForm;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "species")
//    private List<Teammate> teammates;

    public Monster(){}

    public Monster(int baseAttack, int baseDefense,int baseExp,int baseHP,  int baseSpecialAttack, int baseSpecialDefense, int baseSpeed, String expGroup,String name, String type1, String type2,long id, int levelUpLevel, String nextForm) {
        this.id = id;
        this.name = name;
        this.baseHP = baseHP;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseSpecialAttack = baseSpecialAttack;
        this.baseSpecialDefense = baseSpecialDefense;
        this.baseSpeed = baseSpeed;
        this.baseExp = baseExp;
        this.expGroup = expGroup;
        this.type1 = type1;
        this.type2 = type2;
        this.levelUpLevel = levelUpLevel;
        this.nextForm = nextForm;
    }

    public long getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBaseHP() {
        return this.baseHP;
    }

    public int getBaseExp() {
        return this.baseExp;
    }

    public String getExpGroup() {
        return this.expGroup;
    }

    public String getType1() {
        return this.type1;
    }

    public int getLevelUpLevel() {
        return levelUpLevel;
    }

    public void setLevelUpLevel(int levelUpLevel) {
        this.levelUpLevel = levelUpLevel;
    }

    public String getNextForm() {
        return nextForm;
    }

    public void setNextForm(String nextForm) {
        this.nextForm = nextForm;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public void setBaseSpecialAttack(int baseSpecialAttack) {
        this.baseSpecialAttack = baseSpecialAttack;
    }

    public void setBaseSpecialDefense(int baseSpecialDefense) {
        this.baseSpecialDefense = baseSpecialDefense;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public void setBaseExp(int baseExp) {
        this.baseExp = baseExp;
    }

    public void setExpGroup(String expGroup) {
        this.expGroup = expGroup;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType2() {
        return this.type2;
    }

    public int getBaseAttack(){
        return this.baseAttack;
    }

    public int getBaseDefense(){
        return this.baseDefense;
    }

    public int getBaseSpecialAttack(){
        return this.baseSpecialAttack;
    }

    public int getBaseSpecialDefense(){
        return this.baseSpecialDefense;
    }

    public int getBaseSpeed(){
        return this.baseSpeed;
    }

}