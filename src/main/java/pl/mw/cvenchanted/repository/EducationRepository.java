package pl.mw.cvenchanted.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mw.cvenchanted.model.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
}
