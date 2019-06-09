package co.edu.udea.diploma.microservicios.gamification.service;

import co.edu.udea.diploma.microservicios.gamification.domain.GameStats;

public interface GameService {

	GameStats newAttemptForUser(Long userId, Long attemptId, boolean correct) throws Exception;

	GameStats retrieveStatsForUser(Long userId);
}
