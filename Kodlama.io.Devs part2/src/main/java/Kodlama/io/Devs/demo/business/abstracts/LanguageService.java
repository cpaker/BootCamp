package Kodlama.io.Devs.demo.business.abstracts;

import Kodlama.io.Devs.demo.business.requests.languageRequests.CreateLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.DeleteLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.GetByIdLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.UpdateLanguageRequest;
import Kodlama.io.Devs.demo.business.responses.languageResponses.GetAllLanguagesResponse;
import Kodlama.io.Devs.demo.business.responses.languageResponses.GetLanguageResponse;

import java.util.List;

public interface LanguageService {

    void add(CreateLanguageRequest createLanguageRequest) throws Exception;
    void delete(DeleteLanguageRequest deleteLanguageRequest);
    void update(UpdateLanguageRequest updateLanguageRequest);

    List<GetAllLanguagesResponse> getAll();
    GetLanguageResponse get(GetByIdLanguageRequest getByIdLanguageRequest);
}
