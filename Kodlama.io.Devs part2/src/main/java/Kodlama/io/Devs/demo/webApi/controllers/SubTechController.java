package Kodlama.io.Devs.demo.webApi.controllers;

import Kodlama.io.Devs.demo.business.abstracts.SubTechService;
import Kodlama.io.Devs.demo.business.requests.languageRequests.CreateLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.DeleteLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.GetByIdLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.languageRequests.UpdateLanguageRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.CreateSubTechRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.DeleteSubTechRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.GetSubTechRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.UpdateSubTechRequest;
import Kodlama.io.Devs.demo.business.responses.languageResponses.GetAllLanguagesResponse;
import Kodlama.io.Devs.demo.business.responses.languageResponses.GetLanguageResponse;
import Kodlama.io.Devs.demo.business.responses.subTechResponses.GetAllSubTechResponse;
import Kodlama.io.Devs.demo.business.responses.subTechResponses.GetSubTechResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lang/subteches")
public class SubTechController {

    SubTechService subTechService;
    @Autowired
    public SubTechController(SubTechService subTechService) {
        this.subTechService = subTechService;
    }

    @GetMapping("/getall")
    public List<GetAllSubTechResponse> getAll() {
        return subTechService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateSubTechRequest createSubTechRequest) {
        subTechService.add(createSubTechRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteSubTechRequest deleteSubTechRequest) {
        subTechService.delete(deleteSubTechRequest);
    }

    @PutMapping("/update")
    public void update(UpdateSubTechRequest updateSubTechRequest) {
        subTechService.update(updateSubTechRequest);
    }

    @GetMapping("/get")
    public GetSubTechResponses get(GetSubTechRequest getSubTechRequest) {
        return subTechService.get(getSubTechRequest);
    }

}
