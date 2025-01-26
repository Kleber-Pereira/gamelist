package com.portifoliokleber.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifoliokleber.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
