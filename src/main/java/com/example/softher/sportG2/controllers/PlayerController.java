package com.example.softher.sportG2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.softher.sportG2.models.Player;
import com.example.softher.sportG2.models.Team;
import com.example.softher.sportG2.services.PlayerService;
import com.example.softher.sportG2.services.TeamService;

@RequestMapping("api/players")
@RestController
@CrossOrigin(origins = "*")
public class PlayerController {

	@Autowired
	public PlayerService playerService;
	
	@Autowired
	public TeamService teamService;
	
	@GetMapping
	public List<Player> getAllPlayers(){
		return playerService.getAllPlayers();
	}
	
	@PostMapping("/{teamId}")
	public Player addPlayer(@RequestBody Player m, @PathVariable Long teamId) {
		Team t = teamService.getTeamById(teamId);
		m.setTeam(t);
		return playerService.addPlayer(m);
	}
	
	@GetMapping("/{id}")
	public Player getPlayerById(@PathVariable Long id) {
		return playerService.getPlayerById(id);
	}
	
	@PutMapping("/{id}")
	public Player updatePlayer(@RequestBody Player m) {
		return playerService.updatePlayer(m);
	}
	
	@DeleteMapping("/{id}")
	public void deletePlayerById(@PathVariable Long id) {
		playerService.deletePlayer(id);
	}
	
	
}
