package com.codeup.springboot_rpg_practice.models;


import javax.persistence.*;

@Entity
@Table(name="players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="rival")
    private String rival;

    @Column(name="money")
    private Long money;



    public Player(){}
}
