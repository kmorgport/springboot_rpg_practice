package com.codeup.springboot_rpg_practice.models;

import javax.persistence.*;

@Entity
@Table(name = "teammate")
public class Teammate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniqueId;

    @Column(name="tamer_id",nullable=false)
    private Long tamerId;


    @ManyToOne
    @JoinColumn(name="species_id")
    private Monster species;

    @Column(name="health_IV",nullable=false)
    private int healthIV;

    @Column(name="attack_IV",nullable=false)
    private int attackIV;

    @Column(name="defense_IV",nullable=false)
    private int defenseIV;

    @Column(name="specialattack_IV",nullable=false)
    private int specialAttackIV;

    @Column(name="specialdefense_IV",nullable=false)
    private int specialDefenseIV;

    @Column(name="speed_IV",nullable=false)
    private int speedIV;

    @Column(name="species_id",nullable=false)
    private int speciesId;

    @Column(name="health_EV",nullable=false)
    private int healthEV;

    @Column(name="attack_EV",nullable=false)
    private int attackEV;

    @Column(name="defense_EV",nullable=false)
    private int defenseEV;

    @Column(name="specialattack_EV",nullable=false)
    private int specialAttackEV;

    @Column(name="specialdefense_EV",nullable=false)
    private int specialDefenseEV;

    @Column(name="speed_EV",nullable=false)
    private int speedEV;

    @Column(name="move1_id",nullable=false)
    private Long move1Id;

    @Column(name="move2_id")
    private Long move2Id;

    @Column(name="move3_id")
    private Long move3Id;

    @Column(name="move4_id")
    private Long move4Id;

    @Column(name="team_status",nullable=false)
    private boolean teamStatus;

    @Column(name="team_order")
    private int teamOrder;

    public Teammate(){}

    public Teammate(Long uniqueId, Long tamerId, int healthIV, int attackIV, int defenseIV, int specialAttackIV, int specialDefenseIV, int speedIV, int speciesId1, int healthEV, int attackEV, int defenseEV, int specialAttackEV, int specialDefenseEV, int speedEV, Long move1Id, Long move2Id, Long move3Id, Long move4Id, boolean teamStatus, int teamOrder) {
        this.uniqueId = uniqueId;
        this.tamerId = tamerId;
//        this.speciesId = speciesId;
        this.healthIV = healthIV;
        this.attackIV = attackIV;
        this.defenseIV = defenseIV;
        this.specialAttackIV = specialAttackIV;
        this.specialDefenseIV = specialDefenseIV;
        this.speedIV = speedIV;
        this.speciesId = speciesId1;
        this.healthEV = healthEV;
        this.attackEV = attackEV;
        this.defenseEV = defenseEV;
        this.specialAttackEV = specialAttackEV;
        this.specialDefenseEV = specialDefenseEV;
        this.speedEV = speedEV;
        this.move1Id = move1Id;
        this.move2Id = move2Id;
        this.move3Id = move3Id;
        this.move4Id = move4Id;
        this.teamStatus = teamStatus;
        this.teamOrder = teamOrder;
    }

    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Long getTamerId() {
        return tamerId;
    }

    public void setTamerId(Long tamerId) {
        this.tamerId = tamerId;
    }

    public int getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(int speciesId) {
        this.speciesId = speciesId;
    }

    public int getHealthEV() {
        return healthEV;
    }

    public void setHealthEV(int healthEV) {
        this.healthEV = healthEV;
    }

    public int getAttackEV() {
        return attackEV;
    }

    public void setAttackEV(int attackEV) {
        this.attackEV = attackEV;
    }

    public int getDefenseEV() {
        return defenseEV;
    }

    public void setDefenseEV(int defenseEV) {
        this.defenseEV = defenseEV;
    }

    public int getSpecialAttackEV() {
        return specialAttackEV;
    }

    public void setSpecialAttackEV(int specialAttackEV) {
        this.specialAttackEV = specialAttackEV;
    }

    public int getSpecialDefenseEV() {
        return specialDefenseEV;
    }

    public void setSpecialDefenseEV(int specialDefenseEV) {
        this.specialDefenseEV = specialDefenseEV;
    }

    public int getSpeedEV() {
        return speedEV;
    }

    public void setSpeedEV(int speedEV) {
        this.speedEV = speedEV;
    }

    public Long getMove1Id() {
        return move1Id;
    }

    public void setMove1Id(Long move1Id) {
        this.move1Id = move1Id;
    }

    public Long getMove2Id() {
        return move2Id;
    }

    public void setMove2Id(Long move2Id) {
        this.move2Id = move2Id;
    }

    public Long getMove3Id() {
        return move3Id;
    }

    public void setMove3Id(Long move3Id) {
        this.move3Id = move3Id;
    }

    public Long getMove4Id() {
        return move4Id;
    }

    public void setMove4Id(Long move4Id) {
        this.move4Id = move4Id;
    }

    public boolean isTeamStatus() {
        return teamStatus;
    }

    public void setTeamStatus(boolean teamStatus) {
        this.teamStatus = teamStatus;
    }

    public int getTeamOrder() {
        return teamOrder;
    }

    public void setTeamOrder(int teamOrder) {
        this.teamOrder = teamOrder;
    }

    public int getHealthIV() {
        return healthIV;
    }

    public void setHealthIV(int healthIV) {
        this.healthIV = healthIV;
    }

    public int getAttackIV() {
        return attackIV;
    }

    public void setAttackIV(int attackIV) {
        this.attackIV = attackIV;
    }

    public int getDefenseIV() {
        return defenseIV;
    }

    public void setDefenseIV(int defenseIV) {
        this.defenseIV = defenseIV;
    }

    public int getSpecialAttackIV() {
        return specialAttackIV;
    }

    public void setSpecialAttackIV(int specialAttackIV) {
        this.specialAttackIV = specialAttackIV;
    }

    public int getSpecialDefenseIV() {
        return specialDefenseIV;
    }

    public void setSpecialDefenseIV(int specialDefenseIV) {
        this.specialDefenseIV = specialDefenseIV;
    }

    public int getSpeedIV() {
        return speedIV;
    }

    public void setSpeedIV(int speedIV) {
        this.speedIV = speedIV;
    }
}
