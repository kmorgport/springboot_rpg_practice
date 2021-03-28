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




}
