package Kodlama.io.Devs.demo.dataAccess.concretes;

import Kodlama.io.Devs.demo.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.demo.entities.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {


    List<Language> languages;


    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1, "C#"));
        languages.add(new Language(2, "Java"));
        languages.add(new Language(3, "Python"));
    }


    @Override
    public void add(Language language) {
        languages.add(language);
    }


    @Override
    public void delete(int id) {
        for(Language delete : languages){
        if(delete.getId() == id){
            languages.remove(delete);
        }
    }}

    @Override
    public void update(int id, Language program) {
        for (Language updater : languages) {
            if (updater.getId() == id) {
                updater.setName(program.getName());
            }
        }
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language get(int id) {
        for(Language get : languages){
            if(get.getId() == id){
            return get;
            }
        }
return null;
    }
}
