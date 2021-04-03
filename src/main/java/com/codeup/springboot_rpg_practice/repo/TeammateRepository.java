package com.codeup.springboot_rpg_practice.repo;


import com.codeup.springboot_rpg_practice.models.Teammate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeammateRepository extends JpaRepository<Teammate, Long> {

    List<Teammate> findByUniqueId(long id);


}
