package work.lince.gateway.person;

import lombok.extern.slf4j.Slf4j;
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
//    @Autowired
//    public PersonClientService(AuthenticationService authenticationService) {
//        // log.info("[processName:newInstance][userName:{}]", authenticationService.getAuthenticatedUser());
//    }

    public Mono<Person> create(Person person) {
        return Mono.empty();
    }

    public Mono<Person> findById(String id) {
        return Mono.empty();
    }

    public Flux<Person> findAll() {
        WebClient client = WebClient.create("http://localhost:51001/people");

//         Mono<ClientResponse> result = client.get()
//                .uri("/hello")
//                .accept(MediaType.APPLICATION_JSON)
//                .retrieve();
//
//        result.flatMap(res -> res.bodyToMono(String.class)).block();

        return Flux.empty();
    }
}