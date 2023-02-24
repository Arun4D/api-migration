package in.co.ad.apimigration.apimigration.kong.dto;

import java.util.List;

import lombok.Data;

@Data
public class ServiceReplyDto {

    private String next;
    private List<NewServiceReplyDto> data;
}