package Kodlama.io.Devs.demo.business.abstracts;

import Kodlama.io.Devs.demo.entities.Language;

import java.util.List;

public interface LanguageService {

    List<Language> getAll();

    void add(Language language);

    void delete(int id);

    void update(int id, Language program);

    Language get(int id);
}
