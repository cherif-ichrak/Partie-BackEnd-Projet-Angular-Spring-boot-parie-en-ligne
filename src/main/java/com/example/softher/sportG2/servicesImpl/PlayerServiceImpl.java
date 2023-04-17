package com.example.softher.sportG2.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.softher.sportG2.models.Player;
import com.example.softher.sportG2.repositories.PlayerRepository;
import com.example.softher.sportG2.services.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerRepository playerRepository;
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

	@Override
	public Player getPlayerById(Long id) {
		// TODO Auto-generated method stub
		Optional<Player> t = playerRepository.findById(id);
		return t.isPresent() ? t.get() : null;
	}

	@Override
	public Player addPlayer(Player t) {
		// TODO Auto-generated method stub
		return playerRepository.save(t);
	}

	@Override
	public Player updatePlayer(Player t) {
		// TODO Auto-generated method stub
		return playerRepository.save(t);

	}

	@Override
	public void deletePlayer(Long id) {
		playerRepository.deleteById(id);
	}
}
