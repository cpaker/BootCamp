package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.brandRequests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.brandRequests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.brandResponses.GetAllBrandResponse;
import kodlama.io.rentACar.business.responses.brandResponses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandResponse> getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
}
