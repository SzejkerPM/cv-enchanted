package pl.mw.cvenchanted.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mw.cvenchanted.model.ForeignLanguage;

@Repository
public interface ForeignLanguageRepository extends JpaRepository<ForeignLanguage, Long> {
}
