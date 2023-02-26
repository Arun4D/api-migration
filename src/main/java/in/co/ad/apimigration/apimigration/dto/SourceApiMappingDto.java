package in.co.ad.apimigration.apimigration.dto;

import java.util.List;

import lombok.Data;

@Data
public class SourceApiMappingDto {
    private String serviceName;
    private String serviceUrl;
    private String serviceHost;
    private String upstreamName;
    private String routeName;
    private List<String> routePaths;
    private List<String> targets;
    private String tag;
    private boolean isValidationFailed;
    private String validationFailedMessage;
    private boolean isServiceCallError;
    private String serviceCallErrorCode;
    private String serviceCallErrorMessage;
}
