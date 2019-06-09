package co.edu.udea.diploma.microservicios.gamification.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class GameStats {

	private final Long userId;
	private final Long score;
	private final List<Badge> badges;

	public GameStats() {
		this.userId = 0L;
		this.score = 0L;
		this.badges = new ArrayList<>();
	}

	public static GameStats emptyStats(final long userId) {
		return new GameStats(userId, 0L, Collections.emptyList());
	}

	public List<Badge> getBadges() {
		return Collections.unmodifiableList(badges);
	}
}
