package com.codeup.springboot_rpg_practice.models;

import javax.persistence.*;

@Entity
@Table(name= "moves")
public class Move {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniqueId;

    @Column(name="move_name", nullable = false)
    private String name;

    @Column(name="type", nullable = false)
    private String type;

    @Column(name="macro_cat", nullable = false)
    private String macroCat;

    @Column(name="micro_cat")
    private String microCat;

    @Column(name="priority",nullable = false)
    private int priority;

    @Column(name="usage_points", nullable = false)
    private int usePoints;

    @Column(name="accuracy")
    private int accuracy;

    @Column(name="power")
    private int power;

    @Column(name="buff_debuff_integer")
    private int buffDebuffInt;

    @Column(name="buff_debuff_type")
    private String buffDebuffType;

    @Column(name="buff_debuff_chance")
    private int buffDebuffChance;

    @Column(name="status")
    private String status;

    @Column(name="status_chance")
    private int statusChance;

    public Move(){}

    public Move(Long uniqueId, String name, String type, String macroCat, String microCat, int priority, int usePoints, int accuracy, int power, int buffDebuffInt, String buffDebuffType, int buffDebuffChance, String status, int statusChance) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.type = type;
        this.macroCat = macroCat;
        this.microCat = microCat;
        this.priority = priority;
        this.usePoints = usePoints;
        this.accuracy = accuracy;
        this.power = power;
        this.buffDebuffInt = buffDebuffInt;
        this.buffDebuffType = buffDebuffType;
        this.buffDebuffChance = buffDebuffChance;
        this.status = status;
        this.statusChance = statusChance;
    }

    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMacroCat() {
        return macroCat;
    }

    public void setMacroCat(String macroCat) {
        this.macroCat = macroCat;
    }

    public String getMicroCat() {
        return microCat;
    }

    public void setMicroCat(String microCat) {
        this.microCat = microCat;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getUsePoints() {
        return usePoints;
    }

    public void setUsePoints(int usePoints) {
        this.usePoints = usePoints;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getBuffDebuffInt() {
        return buffDebuffInt;
    }

    public void setBuffDebuffInt(int buffDeBuffInt) {
        this.buffDebuffInt = buffDeBuffInt;
    }

    public String getBuffDebuffType() {
        return buffDebuffType;
    }

    public void setBuffDebuffType(String buffDebuffType) {
        this.buffDebuffType = buffDebuffType;
    }

    public int getBuffDebuffChance() {
        return buffDebuffChance;
    }

    public void setBuffDebuffChance(int buffDebuffChance) {
        this.buffDebuffChance = buffDebuffChance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusChance() {
        return statusChance;
    }

    public void setStatusChance(int statusChance) {
        this.statusChance = statusChance;
    }
}
