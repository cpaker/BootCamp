package Kodlama.io.Devs.demo.business.requests.subTechRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubTechRequest {
    private String name;
    private int id;
}
