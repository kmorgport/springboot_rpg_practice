package com.codeup.springboot_rpg_practice.repo;

import com.codeup.springboot_rpg_practice.models.Monster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonsterRepository extends JpaRepository<Monster,Long> {

    List<Monster> findByIdEquals(Long id);
}
