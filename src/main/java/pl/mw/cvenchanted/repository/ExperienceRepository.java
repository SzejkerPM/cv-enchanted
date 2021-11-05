package pl.mw.cvenchanted.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mw.cvenchanted.model.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
