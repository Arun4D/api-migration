package in.co.ad.apimigration.apimigration.apigee.dto;

import java.util.List;

import lombok.Data;

@Data
public class ApiTargetLoadBalancerDto {
    private int maxFailures;
    private boolean retryEnabled;
    private int targetDisableSecs;
    private List<ApiTargetLoadBalancerServerDto> server;

}
