package in.co.ad.apimigration.apimigration.client;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestClient <T>{
    private final RestTemplate restTemplate;

    @SuppressWarnings(value = { "unchecked" })
    public T invokeLogin(String url, HttpMethod httpMethod, T body, String authToken, Class<?> clazz) {
    
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setBasicAuth(authToken);
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<T> entity = new HttpEntity<>(body,headers);

        ResponseEntity<?> result =  restTemplate.exchange(url, httpMethod, entity, clazz);

        return (T) result.getBody();
    }

    @SuppressWarnings(value = { "unchecked" })
    public T invoke(String url, HttpMethod httpMethod, T body, String userName, String password, Class<?> clazz) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        
        if (!StringUtils.isBlank(password) && !StringUtils.isBlank(userName)) {
            headers.setBasicAuth(userName, password);
        }
        
        HttpEntity<T> entity = new HttpEntity<>(body,headers);

        ResponseEntity<?> result =  restTemplate.exchange(url, httpMethod, entity, clazz);

        return (T) result.getBody();
    }

    public T invokeSpecDownload(String url, HttpMethod httpMethod, T body, String bearerToken, Class<?> clazz) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        
        if (!StringUtils.isBlank(bearerToken)) {
            headers.setBearerAuth(bearerToken);
        }
        
        HttpEntity<T> entity = new HttpEntity<>(body,headers);

        ResponseEntity<?> result =  restTemplate.exchange(url, httpMethod, entity, clazz);

        return (T) result.getBody();
    }
}
