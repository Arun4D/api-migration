package in.co.ad.apimigration.apimigration.apigee.dto;

import lombok.Data;

@Data
public class ApiTargetDto {
    private String connectionType;
    private ApiTargetConnection connection;
    private String description;
    private String name;
    private String type;

}
