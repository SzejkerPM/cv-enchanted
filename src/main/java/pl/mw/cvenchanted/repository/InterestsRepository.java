package pl.mw.cvenchanted.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mw.cvenchanted.model.Interests;

@Repository
public interface InterestsRepository extends JpaRepository<Interests, Long> {
}
