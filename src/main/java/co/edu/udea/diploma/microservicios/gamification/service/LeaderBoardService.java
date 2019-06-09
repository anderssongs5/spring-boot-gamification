package co.edu.udea.diploma.microservicios.gamification.service;

import java.util.List;

import co.edu.udea.diploma.microservicios.gamification.domain.LeaderBoardRow;

public interface LeaderBoardService {

	List<LeaderBoardRow> getCurrentLeaderBoard();
}
