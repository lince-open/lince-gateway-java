package work.lince.gateway.person;

import feign.Body;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/gateway/people", produces = MediaType.APPLICATION_JSON_VALUE)
public class ResourceController {

    @Autowired
    protected PersonClientService service;

    @Timed("lince.gateway.people.find-all")
    @GetMapping
    public Flux<Person> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Mono<Person> create(@RequestBody Person person) {
        return service.create(person);
    }

    @PostMapping("/{id}")
    public Mono<Person> findById(@PathVariable(value = "id") String id) {
        return service.findById(id);
    }
}