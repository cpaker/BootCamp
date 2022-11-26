package Kodlama.io.Devs.demo.business.abstracts;

import Kodlama.io.Devs.demo.business.requests.subTechRequests.CreateSubTechRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.DeleteSubTechRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.GetSubTechRequest;
import Kodlama.io.Devs.demo.business.requests.subTechRequests.UpdateSubTechRequest;
import Kodlama.io.Devs.demo.business.responses.subTechResponses.GetAllSubTechResponse;
import Kodlama.io.Devs.demo.business.responses.subTechResponses.GetSubTechResponses;
import Kodlama.io.Devs.demo.entities.SubTech;

import java.util.List;
import java.util.Optional;

public interface SubTechService {

    void add(CreateSubTechRequest createSubTechRequest);
    void delete(DeleteSubTechRequest deleteSubTechRequest);
    void update(UpdateSubTechRequest updateSubTechRequest);

    List<GetAllSubTechResponse> getAll();
    GetSubTechResponses get(GetSubTechRequest getSubTechRequest);
}
