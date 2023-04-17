package com.example.softher.sportG2.services;

import java.util.List;

import com.example.softher.sportG2.models.Team;

public interface TeamService {
	public List<Team> getAllTeams();

	public Team getTeamById(Long id);

	public Team addTeam(Team m);

	public Team updateTeam(Team m);

	public void deleteTeam(Long id);
}
