package co.edu.udea.diploma.microservicios.gamification.client;

import co.edu.udea.diploma.microservicios.gamification.client.dto.MultiplicationResultAttempt;

public interface MultiplicationResultAttemptClient {

	MultiplicationResultAttempt retrieveMultiplicationResultAttemptbyId(final Long multiplicationId);

}
