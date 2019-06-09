package co.edu.udea.diploma.microservicios.gamification.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import co.edu.udea.diploma.microservicios.gamification.domain.LeaderBoardRow;
import co.edu.udea.diploma.microservicios.gamification.domain.ScoreCard;

public interface ScoreCardRepository extends CrudRepository<ScoreCard, Long> {

	@Query("SELECT SUM(s.score) FROM co.edu.udea.diploma.microservicios.gamification.domain.ScoreCard s "
			+ "WHERE s.userId = :userId GROUP BY s.userId")
	Long getTotalScoreForUser(@Param("userId") final Long userId);

	@Query("SELECT NEW co.edu.udea.diploma.microservicios.gamification.domain.LeaderBoardRow(s.userId, SUM(s.score)) "
			+ "FROM co.edu.udea.diploma.microservicios.gamification.domain.ScoreCard s "
			+ "GROUP BY s.userId ORDER BY SUM(s.score) DESC")
	List<LeaderBoardRow> findAllScores();

	List<ScoreCard> findByUserIdOrderByScoreTimeStampDesc(final Long userId);
}
