package in.co.ad.apimigration.apimigration.apigee.dto;

import lombok.Data;

@Data
public class ApiTokenDto {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private String expires_in;
    private String scope;
    private String jti;

}
