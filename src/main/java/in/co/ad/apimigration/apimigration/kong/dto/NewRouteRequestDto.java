package in.co.ad.apimigration.apimigration.kong.dto;

import java.util.List;

import lombok.Data;

@Data
public class NewRouteRequestDto {

    private String name;
    private List<String> paths;
}
