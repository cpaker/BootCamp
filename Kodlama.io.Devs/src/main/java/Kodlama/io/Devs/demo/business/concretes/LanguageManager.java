package Kodlama.io.Devs.demo.business.concretes;

import Kodlama.io.Devs.demo.business.abstracts.LanguageService;
import Kodlama.io.Devs.demo.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.demo.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {

   private LanguageRepository languageRepository;


   @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(Language language) {
        languageRepository.add(language);
    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }

    @Override
    public void update(int id, Language program) {
        languageRepository.update(id, program);
    }

    @Override
    public Language get(int id) {
        return languageRepository.get(id);
    }
}
