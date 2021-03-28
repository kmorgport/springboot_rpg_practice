package com.codeup.springboot_rpg_practice.repo;

import com.codeup.springboot_rpg_practice.models.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonsterRepository extends JpaRepository<Monster,Long> {

    List<Monster> findByIdEquals(long id);
}
