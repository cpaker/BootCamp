package Kodlama.io.Devs.demo.business.concretes;

import Kodlama.io.Devs.demo.business.abstracts.SubTechService;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.CreateSubTechRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.DeleteSubTechRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.GetSubTechRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.UpdateSubTechRequest;
import Kodlama.io.Devs.demo.business.responses.subTechResponses.GetAllSubTechResponse;
import Kodlama.io.Devs.demo.business.responses.subTechResponses.GetSubTechResponses;
import Kodlama.io.Devs.demo.dataAccess.SubTechRepository;
import Kodlama.io.Devs.demo.entities.SubTech;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechManager implements SubTechService {

    private SubTechRepository subTechRepository;

    @Autowired
    public SubTechManager(SubTechRepository subTechRepository) {
        this.subTechRepository = subTechRepository;
    }

    @Override
    public List<GetAllSubTechResponse> getAll() {
        List<SubTech> teches = subTechRepository.findAll();
        List<GetAllSubTechResponse> subTechResponses = new ArrayList<GetAllSubTechResponse>();
        for (SubTech subScan : teches) {
            GetAllSubTechResponse responseItem = new GetAllSubTechResponse();
            responseItem.setId(subScan.getId());
            responseItem.setName(subScan.getName());
            subTechResponses.add(responseItem);

        }
        return subTechResponses;
    }

    @Override
    public void add(CreateSubTechRequest createSubTechRequest) {
        SubTech subTech = new SubTech();
        subTech.setName(createSubTechRequest.getName());
        subTech.setLanguage(subTech.getLanguage());
        subTechRepository.save(subTech);
    }

    @Override
    public void delete(DeleteSubTechRequest deleteSubTechRequest) {
        List<SubTech> subTeches = subTechRepository.findAll();
        for(SubTech subTech : subTeches){
            if(subTech.getId()== deleteSubTechRequest.getId()){
                subTechRepository.deleteById(subTech.getId());
            }
        }

    }

    @Override
    public void update(UpdateSubTechRequest updateSubTechRequest) {
        List<SubTech> subTeches = subTechRepository.findAll();
        for (SubTech sub : subTeches) {
            if (sub.getId() == updateSubTechRequest.getId()) {
                sub.setName(updateSubTechRequest.getName());
                sub.setId(updateSubTechRequest.getId());
            }
            subTechRepository.save(sub);
        }
    }

    @Override
    public GetSubTechResponses get(GetSubTechRequest getSubTechRequest) {

        List<SubTech> subTeches = subTechRepository.findAll();
        GetSubTechResponses responseItem = new GetSubTechResponses();

        for (SubTech subTech : subTeches) {
            if (subTech.getId() == getSubTechRequest.getId()) {
                responseItem.setName(subTech.getName());
                break;
            }
        }
        return responseItem;
    }
}
