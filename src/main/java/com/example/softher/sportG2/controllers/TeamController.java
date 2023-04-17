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

import com.example.softher.sportG2.models.Team;
import com.example.softher.sportG2.services.TeamService;

@RequestMapping("api/teams")
@RestController
@CrossOrigin(origins = "*")
public class TeamController {

	@Autowired
	public TeamService teamService;
	
	@GetMapping
	public List<Team> getAllTeams(){
		return teamService.getAllTeams();
	}
	
	@PostMapping
	public Team addTeam(@RequestBody Team m) {
		return teamService.addTeam(m);
	}
	
	@GetMapping("/{id}")
	public Team getTeamById(@PathVariable Long id) {
		return teamService.getTeamById(id);
	}
	
	@PutMapping("/{id}")
	public Team updateTeam(@RequestBody Team m) {
		return teamService.updateTeam(m);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTeamById(@PathVariable Long id) {
		teamService.deleteTeam(id);
	}
}
	