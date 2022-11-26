package Kodlama.io.Devs.demo.business.requests.languageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UpdateLanguageRequest {

    private int id;
    private String name;
}
