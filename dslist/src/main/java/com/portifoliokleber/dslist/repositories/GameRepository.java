package com.portifoliokleber.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifoliokleber.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
