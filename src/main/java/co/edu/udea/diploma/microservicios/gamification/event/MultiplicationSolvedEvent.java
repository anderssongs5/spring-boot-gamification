package co.edu.udea.diploma.microservicios.gamification.event;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Event that models the fact that a
 * {@link microservices.book.multiplication.domain.Multiplication} has been
 * solved in the system. Provides some context information about the
 * multiplication.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class MultiplicationSolvedEvent implements Serializable {

	private static final long serialVersionUID = -8270801217529769917L;

	private final Long multiplicationResultAttemptId;
	private final Long userId;
	private final boolean correct;

	public MultiplicationSolvedEvent() {
		super();
		this.multiplicationResultAttemptId = 0L;
		this.userId = 0L;
		this.correct = false;
	}

}
