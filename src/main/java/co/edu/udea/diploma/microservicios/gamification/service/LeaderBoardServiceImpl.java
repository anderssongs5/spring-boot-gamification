package co.edu.udea.diploma.microservicios.gamification.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.udea.diploma.microservicios.gamification.domain.LeaderBoardRow;
import co.edu.udea.diploma.microservicios.gamification.repository.ScoreCardRepository;

@Service
public class LeaderBoardServiceImpl implements LeaderBoardService {

	private ScoreCardRepository scoreCardRepository;

    LeaderBoardServiceImpl(ScoreCardRepository scoreCardRepository) {
        this.scoreCardRepository = scoreCardRepository;
    }

    @Override
    public List<LeaderBoardRow> getCurrentLeaderBoard() {
        return scoreCardRepository.findAllScores();
    }

}
