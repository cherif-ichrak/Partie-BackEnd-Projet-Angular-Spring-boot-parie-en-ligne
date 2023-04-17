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

import com.example.softher.sportG2.models.Matche;
import com.example.softher.sportG2.services.MatchService;

@RequestMapping("api/matches")
@RestController
@CrossOrigin(origins = "*")
public class MatchController {

	@Autowired
	public MatchService matchService;
	
	@GetMapping
	public List<Matche> getAllMatches(){
		return matchService.getAllMatches();
	}
	
	@PostMapping
	public Matche addMatch(@RequestBody Matche m) {
		return matchService.addMatch(m);
	}
	
	@GetMapping("/{id}")
	public Matche getMatchById(@PathVariable Long id) {
		return matchService.getMatchById(id);
	}
	
	@PutMapping("/{id}")
	public Matche updateMatch(@RequestBody Matche m) {
		return matchService.updateMatch(m);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMatchById(@PathVariable Long id) {
		matchService.deleteMatch(id);
	}
	
	
}
