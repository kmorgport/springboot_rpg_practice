package com.codeup.springboot_rpg_practice.models;

import javax.persistence.*;

@Entity
@Table(name = "monsters")
public class Monster {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable=false)
    private int baseHP;

    @Column(nullable=false)
    private int baseAttack;

    @Column(nullable=false)
    private int baseDefense;

    @Column(nullable=false)
    private int baseSpecialAttack;

    @Column(nullable=false)
    private int baseSpecialDefense;

    @Column(nullable=false)
    private int baseSpeed;

    @Column(nullable=false)
    private int baseExp;

    @Column(nullable=false)
    private String expGroup;

    @Column(nullable=false)
    private String type1;

    @Column
    private String type2;

    public Monster(){}

    public Monster(String name, int baseHP, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSpecialDefense, int baseSpeed, int baseExp, String expGroup, String type1) {
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
    }

    public Monster(String name, int baseHP, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSpecialDefense, int baseSpeed, int baseExp, String expGroup, String type1, String type2) {
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
    }

    public Monster(long id, String name, int baseHP, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSpecialDefense, int baseSpeed, int baseExp, String expGroup, String type1) {
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
    }

    public Monster(long id, String name, int baseHP, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSpecialDefense, int baseSpeed, int baseExp, String expGroup, String type1, String type2) {
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
    }



    public long getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBaseHP() {
        return baseHP;
    }

    public int getBaseExp() {
        return baseExp;
    }

    public String getExpGroup() {
        return expGroup;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
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
