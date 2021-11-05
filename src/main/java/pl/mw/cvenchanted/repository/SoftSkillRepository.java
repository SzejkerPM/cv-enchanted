package pl.mw.cvenchanted.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mw.cvenchanted.model.SoftSkill;

@Repository
public interface SoftSkillRepository extends JpaRepository<SoftSkill, Long> {
}
