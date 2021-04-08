package com.codeup.springboot_rpg_practice.models;

import com.codeup.springboot_rpg_practice.repo.MoveRepository;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class MonsterModel extends Teammate{

    MoveRepository movesDao;

    private long speciesId;

    private Long uniqueId;

    private Long tamerId;

    private String name;

    private int baseHP;

    private int healthIV;

    private int healthEV;

    private int baseAttack;

    private int attackIV;

    private int attackEV;

    private int baseDefense;

    private int defenseIV;

    private int defenseEV;

    private int baseSpecialAttack;

    private int specialAttackEV;

    private int specialAttackIV;

    private int baseSpecialDefense;

    private int specialDefenseIV;

    private int specialDefenseEV;

    private int baseSpeed;

    private int speedIV;

    private int speedEV;

    private int baseExp;

    private long totalExp;

    private long expToNext;

    private String expGroup;

    private List<String> types;

    private int levelUpLevel;

    private String nextForm;

    private boolean teamStatus;

    private int teamOrder;

    private List<Move> moveList;

    public MonsterModel(){};

    public MonsterModel(Monster monster, Teammate teammate, MoveRepository movesDao){
        List<Long> moveIds = new ArrayList<>();
        moveIds.add(0,teammate.getMove1Id());
        moveIds.add(0,teammate.getMove2Id());
        moveIds.add(0,teammate.getMove3Id());
        moveIds.add(0,teammate.getMove4Id());
        this.moveList = findMoves(moveIds, movesDao);
        this.speciesId = monster.getId();
        this.name = monster.getName();
        this.baseHP = monster.getBaseHP();
        this.healthIV = teammate.getHealthIV();
        this.healthEV = teammate.getHealthEV();
        this.baseAttack = monster.getBaseAttack();
        this.attackIV = teammate.getAttackIV();
        this.attackEV = teammate.getAttackEV();
        this.baseDefense = monster.getBaseDefense();
        this.defenseIV = teammate.getDefenseIV();
        this.defenseEV =  teammate.getDefenseEV();
        this.baseSpecialAttack = monster.getBaseSpecialAttack();
        this.specialAttackIV = teammate.getSpecialAttackIV();
        this.specialAttackEV = teammate.getSpecialAttackEV();
        this.baseSpecialDefense = monster.getBaseSpecialDefense();
        this.specialDefenseIV = teammate.getSpecialDefenseIV();
        this.specialDefenseEV = teammate.getSpecialDefenseEV();
        this.baseSpeed = monster.getBaseSpeed();
        this.speedIV = teammate.getSpeedIV();
        this.speedEV = teammate.getSpeedEV();
        this.baseExp = monster.getBaseExp();
        this.totalExp = teammate.getTotalExp();
        this.expToNext = teammate.getExpToNext();
        this.expGroup = monster.getExpGroup();
        this.types = new ArrayList<>();
        types.add(0, monster.getType1());
        types.add(1, monster.getType2());
        this.levelUpLevel = monster.getLevelUpLevel();
        this.nextForm = monster.getNextForm();
        this.teamOrder = teammate.getTeamOrder();
        this.teamStatus = teammate.isTeamStatus();

    }

    public List<Move> findMoves(List<Long> moveIds, MoveRepository movesDao){
        List<Move> moveList = new ArrayList<>();
        for(Long move: moveIds){
            if(move!=null){
                Move newMove = movesDao.findByUniqueIdEquals(move).get(0);
                moveList.add(newMove);
            }

        }
        return moveList;
    }

}
