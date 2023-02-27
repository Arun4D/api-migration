package in.co.ad.apimigration.apimigration.kong.dto;

import lombok.Data;

@Data
public class NewUpstreamTargetReplyDto {

    private String created_at;
    private String name;
    private String id;
    private String algorithm;
    private String tags;
}
