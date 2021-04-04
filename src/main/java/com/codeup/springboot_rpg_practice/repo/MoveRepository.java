package com.codeup.springboot_rpg_practice.repo;

import com.codeup.springboot_rpg_practice.models.Move;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoveRepository extends JpaRepository<Move,Long> {

    List<Move> findByUniqueIdEquals(Long id);
}
