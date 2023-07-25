package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.modelRequests.CreateModelRequest;
import kodlama.io.rentACar.business.responses.modelResponses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);

}
