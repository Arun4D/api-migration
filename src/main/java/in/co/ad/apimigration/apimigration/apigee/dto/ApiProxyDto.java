package in.co.ad.apimigration.apimigration.apigee.dto;

import lombok.Data;

@Data
public class ApiProxyDto {
    private String connectionType;
    private ApiProxyConnection connection;
    private String description;
    private String name;
    private String type;

}
