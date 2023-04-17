package com.example.softher.sportG2.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.softher.sportG2.models.Matche;
import com.example.softher.sportG2.repositories.MatchRepository;
import com.example.softher.sportG2.services.MatchService;

@Service
public class MatchServiceImpl implements MatchService {

	@Autowired
	private MatchRepository matchRepository;
	@Override
	public List<Matche> getAllMatches() {
		// TODO Auto-generated method stub
		return matchRepository.findAll();
	}

	@Override
	public Matche getMatchById(Long id) {
		// TODO Auto-generated method stub
		Optional<Matche> m = matchRepository.findById(id);
		return m.isPresent() ? m.get() : null;
	}

	@Override
	public Matche addMatch(Matche m) {
		// TODO Auto-generated method stub
		return matchRepository.save(m);
	}

	@Override
	public Matche updateMatch(Matche m) {
		// TODO Auto-generated method stub
		return matchRepository.save(m);
	}

	@Override
	public void deleteMatch(Long id) {
		// TODO Auto-generated method stub
		matchRepository.deleteById(id);
	}

}
