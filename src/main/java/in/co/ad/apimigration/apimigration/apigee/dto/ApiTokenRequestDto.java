package in.co.ad.apimigration.apimigration.apigee.dto;

import lombok.Data;

@Data
public class ApiTokenRequestDto {
    private String username;
    private String password;
    private String grant_type;

}
