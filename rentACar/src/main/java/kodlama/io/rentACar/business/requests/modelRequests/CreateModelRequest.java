package kodlama.io.rentACar.business.requests.modelRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private int brandId;
}
