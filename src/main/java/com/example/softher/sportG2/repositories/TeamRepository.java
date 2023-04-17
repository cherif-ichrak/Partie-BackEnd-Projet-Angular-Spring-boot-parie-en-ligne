package com.example.softher.sportG2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.softher.sportG2.models.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
