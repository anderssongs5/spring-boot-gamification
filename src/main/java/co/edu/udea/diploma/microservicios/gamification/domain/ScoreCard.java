package co.edu.udea.diploma.microservicios.gamification.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public final class ScoreCard {

	// The default score assigned to this card, if not specified.
	public static final Long DEFAULT_SCORE = 10L;

	@Id
	@GeneratedValue
	@Column(name = "CARD_ID")
	private final Long cardId;

	@Column(name = "USER_ID")
	private final Long userId;

	@Column(name = "ATTEMPT_ID")
	private final Long attemptId;

	@Column(name = "SCORE_TS")
	private final long scoreTimeStamp;

	@Column(name = "SCORE")
	private final Long score;

	// Empty constructor for JSON / JPA
	public ScoreCard() {
		this(null, null, null, 0, 0L);
	}

	public ScoreCard(final Long userId, final Long attemptId) {
		this(null, userId, attemptId, System.currentTimeMillis(), DEFAULT_SCORE);
	}

}
