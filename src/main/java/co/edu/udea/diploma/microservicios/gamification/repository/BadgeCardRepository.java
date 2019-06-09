package co.edu.udea.diploma.microservicios.gamification.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.edu.udea.diploma.microservicios.gamification.domain.BadgeCard;

public interface BadgeCardRepository extends CrudRepository<BadgeCard, Long> {

	List<BadgeCard> findByUserIdOrderByBadgeTimestampDesc(final Long userId);
}
