package co.edu.udea.diploma.microservicios.gamification.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class LeaderBoardRow {

	private final Long userId;
	private final Long totalScore;

	public LeaderBoardRow() {
		this(null, 0L);
	}
}
