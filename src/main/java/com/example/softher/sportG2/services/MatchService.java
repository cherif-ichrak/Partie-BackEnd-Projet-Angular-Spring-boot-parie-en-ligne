package com.example.softher.sportG2.services;

import java.util.List;

import com.example.softher.sportG2.models.Matche;

public interface MatchService {

	public List<Matche> getAllMatches();

	public Matche getMatchById(Long id);

	public Matche addMatch(Matche m);

	public Matche updateMatch(Matche m);

	public void deleteMatch(Long id);
}
