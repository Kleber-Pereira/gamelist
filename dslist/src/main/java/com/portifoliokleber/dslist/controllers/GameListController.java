package com.portifoliokleber.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portifoliokleber.dslist.dto.GameDTO;
import com.portifoliokleber.dslist.dto.GameListDTO;
import com.portifoliokleber.dslist.dto.GameMinDTO;
import com.portifoliokleber.dslist.services.GameListService;
import com.portifoliokleber.dslist.services.GameService;


@RestController
@RequestMapping(value="/lists")
public class GameListController {
	@Autowired
	private GameListService gameListService;
		
	
	@GetMapping
	public List<GameListDTO> findAll(){
		
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}

}
