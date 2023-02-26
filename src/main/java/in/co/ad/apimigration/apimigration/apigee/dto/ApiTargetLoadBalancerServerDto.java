package in.co.ad.apimigration.apimigration.apigee.dto;

import lombok.Data;

@Data
public class ApiTargetLoadBalancerServerDto {
    private boolean isEnabled;
    private boolean isFallback;
    private int weight;
    private String name;

}
