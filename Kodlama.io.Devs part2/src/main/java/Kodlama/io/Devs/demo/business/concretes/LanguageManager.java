package Kodlama.io.Devs.demo.business.concretes;

import Kodlama.io.Devs.demo.business.abstracts.LanguageService;
import Kodlama.io.Devs.demo.business.requests.languageRequests.CreateLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.DeleteLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.GetByIdLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.UpdateLanguageRequest;
import Kodlama.io.Devs.demo.business.responses.languageResponses.GetAllLanguagesResponse;
import Kodlama.io.Devs.demo.business.responses.languageResponses.GetLanguageResponse;
import Kodlama.io.Devs.demo.dataAccess.LanguageRepository;
import Kodlama.io.Devs.demo.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    @Override
    public List<GetAllLanguagesResponse> getAll() {
        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguagesResponse> languagesResponses = new ArrayList<GetAllLanguagesResponse>();
        for (Language language : languages) {
            GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());
            languagesResponses.add(responseItem);
        }
        return languagesResponses;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
        Language language = new Language();
        List<Language> languages = languageRepository.findAll();
        for (Language langName : languages) {
            if (createLanguageRequest.getName().isEmpty()) {
                throw new Exception("Yazılım dili boş geçilemez");
            } else if (langName.getName() == createLanguageRequest.getName()) {
                throw new Exception("Yazılım dili zaten mevcut.");
            }
        }
        language.setName(createLanguageRequest.getName());
        languageRepository.save(language);
    }


    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        List<Language> languages = languageRepository.findAll();
        for (Language language : languages) {
            if (language.getId() == deleteLanguageRequest.getId()) {
                languageRepository.delete(language);
                break;
            }
        }

    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {
        List<Language> languages = languageRepository.findAll();
        for (Language langId : languages) {
            if (langId.getId() == updateLanguageRequest.getId())
                langId.setName(updateLanguageRequest.getName());
            languageRepository.save(langId);
            break;
        }
    }

    @Override
    public GetLanguageResponse get(GetByIdLanguageRequest getByIdLanguageRequest) {
        GetLanguageResponse responseItem = new GetLanguageResponse();
        List<Language> languages = languageRepository.findAll();

        for (Language lang1 : languages) {
            if (lang1.getId() == getByIdLanguageRequest.getId()) {
                responseItem.setLanguageName(lang1.getName());
                break;
            }
        }
        return responseItem;

    }
}
