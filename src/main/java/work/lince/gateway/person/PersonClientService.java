package work.lince.gateway.person;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class PersonClientService {
    //
//    protected AuthenticationService authenticationService;
//
    @Autowired
    public PersonClientService(WebClient webClient) {
        this.client = webClient;
    }

    protected WebClient client;

    public Mono<Person> create(Person person) {
        return Mono.empty();
    }

    public Mono<Person> findById(String id) {
        Mono<Person> result = client.get()
                .uri("http://localhost:51001/people/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Person.class);
        return result;
    }

    public Flux<Person> findAll() {
        Flux<Person> result = client.get()
                .uri("http://localhost:51001/people")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Person.class);
        return result;
    }
}