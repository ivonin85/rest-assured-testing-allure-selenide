package rf.ivonin.dto.createDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.experimental.Accessors;

@lombok.Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserDTO {
    private String name;
    private String job;
    private String id;
    private String createdAt;
}
