package in.co.ad.apimigration.apimigration.apigee.dto;

import java.util.List;

import lombok.Data;

@Data
public class ApiRevisionDto {
    private List<String> basepaths;
    private String description;
    private String displayName;
    private String name;
    private List<String> policies;
    private String revision;
    private String type;

}
