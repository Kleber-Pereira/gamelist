package com.portifoliokleber.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portifoliokleber.dslist.dto.GameDTO;
import com.portifoliokleber.dslist.dto.GameListDTO;
import com.portifoliokleber.dslist.dto.GameMinDTO;
import com.portifoliokleber.dslist.entities.Game;
import com.portifoliokleber.dslist.entities.GameList;
import com.portifoliokleber.dslist.repositories.GameListRepository;
import com.portifoliokleber.dslist.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly=true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
		
		
	}
	
	

}
