package in.co.ad.apimigration.apimigration.kong.dto;

import java.util.List;

import lombok.Data;

@Data
public class NewRouteReplyDto {

    private String headers;
    private long regex_priority;
    private String path_handling;
    private String created_at;
    private List<String> protocols;
    private RouterServiceDto service;
    private String name;
    private boolean strip_path;
    private boolean response_buffering;
    private long updated_at;
    private int https_redirect_status_code;
    private String snis;
    private String hosts;
    private boolean preserve_host;
    private List<String> paths;
    private String methods;
    private String id;
    private String destinations;
    private String request_buffering;
    private String tags;
}
