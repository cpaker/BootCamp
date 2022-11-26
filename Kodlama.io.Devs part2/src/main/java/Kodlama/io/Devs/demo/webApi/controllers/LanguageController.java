package Kodlama.io.Devs.demo.webApi.controllers;

import Kodlama.io.Devs.demo.business.abstracts.LanguageService;
import Kodlama.io.Devs.demo.business.requests.languageRequests.CreateLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.DeleteLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.GetByIdLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.UpdateLanguageRequest;
import Kodlama.io.Devs.demo.business.responses.languageResponses.GetAllLanguagesResponse;
import Kodlama.io.Devs.demo.business.responses.languageResponses.GetLanguageResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lang")
public class LanguageController {

    private LanguageService service;

    public LanguageController(LanguageService service) {
        this.service = service;
    }

    @GetMapping("/getall")
    public List<GetAllLanguagesResponse> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
        service.add(createLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        service.delete(deleteLanguageRequest);
    }

    @PutMapping("/update")
    public void update(UpdateLanguageRequest updateLanguageRequest) {
        service.update(updateLanguageRequest);
    }

    @GetMapping("/get")
    public GetLanguageResponse get(GetByIdLanguageRequest getByIdLanguageRequest) {
        return service.get(getByIdLanguageRequest);
    }
}
