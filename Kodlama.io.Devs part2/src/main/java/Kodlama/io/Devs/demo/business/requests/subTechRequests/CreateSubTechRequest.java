package Kodlama.io.Devs.demo.business.requests.subTechRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class CreateSubTechRequest {
    String name;
    String lang;
}
