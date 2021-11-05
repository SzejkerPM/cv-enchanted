package pl.mw.cvenchanted.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mw.cvenchanted.model.TechnicalSkill;

@Repository
public interface TechnicalSkillRepository extends JpaRepository<TechnicalSkill, Long> {
}
