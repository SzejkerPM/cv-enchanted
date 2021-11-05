package pl.mw.cvenchanted.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mw.cvenchanted.model.TechnicalSkill;
import pl.mw.cvenchanted.repository.TechnicalSkillRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechnicalSkillService {

    private final TechnicalSkillRepository technicalSkillRepository;

    public List<TechnicalSkill> getAll() {
        return technicalSkillRepository.findAll();
    }

    public TechnicalSkill getById(Long id) {
        return technicalSkillRepository.findById(id).orElse(null);
    }

    public void save(TechnicalSkill technicalSkill) {
        technicalSkillRepository.save(technicalSkill);
    }

    public void deleteById(Long id) {
        technicalSkillRepository.deleteById(id);
    }
}
