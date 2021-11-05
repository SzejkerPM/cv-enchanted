package pl.mw.cvenchanted.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mw.cvenchanted.model.Experience;
import pl.mw.cvenchanted.repository.ExperienceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperienceService {

    private final ExperienceRepository experienceRepository;

    public List<Experience> getAll() {
        return experienceRepository.findAll();
    }

    public Experience getById(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    public void save(Experience experience) {
        experienceRepository.save(experience);
    }

    public void deleteById(Long id) {
        experienceRepository.deleteById(id);
    }
}
