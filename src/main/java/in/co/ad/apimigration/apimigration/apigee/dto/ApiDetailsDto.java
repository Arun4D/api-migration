package in.co.ad.apimigration.apimigration.apigee.dto;

import java.util.List;

import lombok.Data;

@Data
public class ApiDetailsDto {
    private String name;
    private List<String> reversions;
}
