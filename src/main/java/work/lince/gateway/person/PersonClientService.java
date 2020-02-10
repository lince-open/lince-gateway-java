package work.lince.gateway.person;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import work.lince.commons.authentication.AuthenticationService;

@Slf4j
@Service
public class PersonClientService {

    protected AuthenticationService authenticationService;

    @Autowired
    public PersonClientService(AuthenticationService authenticationService) {
        // log.info("[processName:newInstance][userName:{}]", authenticationService.getAuthenticatedUser());
    }

    public Mono<Person> create(Person person) {
        return Mono.empty();
    }

    public Mono<Person> findById(String id) {
        return Mono.empty();
    }

    public Flux<Person> findAll() {
        return Flux.empty();
    }
}