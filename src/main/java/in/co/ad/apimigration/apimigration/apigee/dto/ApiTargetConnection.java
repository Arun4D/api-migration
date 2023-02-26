package in.co.ad.apimigration.apimigration.apigee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ApiTargetConnection {
    private String connectionType;
    @JsonProperty("uRL")
    private String url;
    private ApiTargetLoadBalancerDto loadBalancer;

}
