package dev.maik.runnerz.user;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component
public class UserRestClient {

     private final RestClient restclient;

     public UserRestClient(RestClient.Builder builder){
          this.restclient = builder
                  .baseUrl("https://jsonplaceholder.typicode.com/")
                  .build();
     }

     public List<User>findAll(){
          return restclient.get()
                  .uri("/users")
                  .retrieve()
                  .body(new ParameterizedTypeReference<>() {});
     }

     public User findById(Integer id){
          return restclient.get()
                  .uri("/users/{id}", id)
                  .retrieve()
                  .body(User.class);
     }
}
