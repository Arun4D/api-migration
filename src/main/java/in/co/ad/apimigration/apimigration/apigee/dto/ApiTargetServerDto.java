package in.co.ad.apimigration.apimigration.apigee.dto;

import lombok.Data;

@Data
public class ApiTargetServerDto {
    private String host;
    private boolean isEnabled;
    private int port;
    private String name;

}
