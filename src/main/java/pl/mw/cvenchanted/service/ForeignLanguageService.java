package pl.mw.cvenchanted.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mw.cvenchanted.model.ForeignLanguage;
import pl.mw.cvenchanted.repository.ForeignLanguageRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ForeignLanguageService {

    private final ForeignLanguageRepository foreignLanguageRepository;

    public List<ForeignLanguage> getAll() {
        return foreignLanguageRepository.findAll();
    }

    public ForeignLanguage getById(Long id) {
        return foreignLanguageRepository.findById(id).orElse(null);
    }

    public void save(ForeignLanguage foreignLanguage) {
        foreignLanguageRepository.save(foreignLanguage);
    }

    public void deleteById(Long id) {
        foreignLanguageRepository.deleteById(id);
    }
}
