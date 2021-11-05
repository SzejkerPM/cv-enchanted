package pl.mw.cvenchanted.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mw.cvenchanted.model.SoftSkill;
import pl.mw.cvenchanted.repository.SoftSkillRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SoftSkillService {

    private final SoftSkillRepository softSkillRepository;

    public List<SoftSkill> getAll() {
        return softSkillRepository.findAll();
    }

    public SoftSkill getById(Long id) {
        return softSkillRepository.findById(id).orElse(null);
    }

    public void save(SoftSkill softSkill) {
        softSkillRepository.save(softSkill);
    }

    public void deleteById(Long id) {
        softSkillRepository.deleteById(id);
    }
}
