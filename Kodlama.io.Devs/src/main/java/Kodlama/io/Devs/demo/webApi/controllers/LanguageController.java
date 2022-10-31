package Kodlama.io.Devs.demo.webApi.controllers;

import Kodlama.io.Devs.demo.business.abstracts.LanguageService;
import Kodlama.io.Devs.demo.business.concretes.LanguageManager;
import Kodlama.io.Devs.demo.entities.Language;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class LanguageController {

    private LanguageService service;

    public LanguageController(LanguageService service) {
        this.service = service;
    }

    @GetMapping("/getall")
    public List<Language> getAll() {
        return service.getAll();
    }

    @GetMapping("/add")
    public void add(Language language) {
        service.add(language);
    }

    @GetMapping("/delete")
    public void delete(int id) {
        service.delete(id);
    }

    @GetMapping("/update")
    public void update(int id, Language program) {
        service.update(id, program);
    }

    @GetMapping("/get")
    public Language get(int id) {
        return service.get(id);
    }
}
