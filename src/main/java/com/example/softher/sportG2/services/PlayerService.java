package com.example.softher.sportG2.services;

import java.util.List;

import com.example.softher.sportG2.models.Player;

public interface PlayerService {
	public List<Player> getAllPlayers();

	public Player getPlayerById(Long id);

	public Player addPlayer(Player m);

	public Player updatePlayer(Player m);

	public void deletePlayer(Long id);
}
