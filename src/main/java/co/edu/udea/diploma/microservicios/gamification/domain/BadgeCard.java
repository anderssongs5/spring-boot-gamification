package co.edu.udea.diploma.microservicios.gamification.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
@Entity
public final class BadgeCard {

	@Id
	@GeneratedValue
	@Column(name = "BADGE_ID")
	private final Long badgeId;

	private final Long userId;
	private final long badgeTimestamp;
	private final Badge badge;

	public BadgeCard() {
		this(null, null, 0, null);
	}

	public BadgeCard(final Long userId, final Badge badge) {
		this(null, userId, System.currentTimeMillis(), badge);
	}

}
