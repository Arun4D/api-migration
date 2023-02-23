package in.co.ad.apimigration.apimigration.client;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestClient <T>{
    private final RestTemplate restTemplate;

    @SuppressWarnings(value = { "unchecked" })
    public T invoke(String url, String userName, String password, Class<?> clazz) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setBasicAuth(userName, password);
        HttpEntity<String> entity = new HttpEntity<>("body",headers);

        ResponseEntity<?> result =  restTemplate.exchange(url, HttpMethod.GET, entity, clazz);

        return (T) result.getBody();
    }
}
