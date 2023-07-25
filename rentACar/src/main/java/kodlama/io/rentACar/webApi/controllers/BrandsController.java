package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.brandRequests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.brandRequests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.brandResponses.GetAllBrandResponse;
import kodlama.io.rentACar.business.responses.brandResponses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;


    @GetMapping()
    public List<GetAllBrandResponse> getAll() {
        return brandService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdBrandResponse getById(@PathVariable int id) {
        return brandService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@Valid CreateBrandRequest createBrandRequest) {
        brandService.add(createBrandRequest);
    }

    @PutMapping("/put")
    public void update(@RequestBody @Valid UpdateBrandRequest updateBrandRequest) {
        this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.brandService.delete(id);
    }

}
