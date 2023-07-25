package kodlama.io.rentACar.business.requests.brandRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {

    private int id;
    @NotNull
    @NotBlank
    private String name;
}
