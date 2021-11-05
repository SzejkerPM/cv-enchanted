package pl.mw.cvenchanted.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mw.cvenchanted.model.Education;
import pl.mw.cvenchanted.repository.EducationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EducationService {

    private final EducationRepository educationRepository;

    public List<Education> getAll() {
        return educationRepository.findAll();
    }

    public Education getById(Long id) {
        return educationRepository.findById(id).orElse(null);
    }

    public void save(Education education) {
        educationRepository.save(education);
    }

    public void deleteById(Long id) {
        educationRepository.deleteById(id);
    }
}
