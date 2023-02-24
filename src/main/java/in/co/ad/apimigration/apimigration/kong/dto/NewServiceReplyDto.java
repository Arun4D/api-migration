package in.co.ad.apimigration.apimigration.kong.dto;

import lombok.Data;

@Data
public class NewServiceReplyDto {

    private String ca_certificates;
    private long connect_timeout;
    private String path;
    private String host;
    private String name;
    private String protocol;
    private long write_timeout;
    private long  created_at;
    private long updated_at;
    private int retries;
    private String tls_verify;
    private String tls_verify_depth;
    private boolean enabled;
    private int port;
    private String id;
    private long read_timeout;
    private String client_certificate;
    private String tags;
}
