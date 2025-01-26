package com.portifoliokleber.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portifoliokleber.dslist.dto.GameDTO;
import com.portifoliokleber.dslist.dto.GameMinDTO;
import com.portifoliokleber.dslist.entities.Game;
import com.portifoliokleber.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly=true)
	public GameDTO findById(Long id) {
		Game result =gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly=true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
		
	}
	
	

}
