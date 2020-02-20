package work.lince.gateway.person;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "lince-person", url = "http://localhost:51001/people")
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public interface PersonClientService {

    @PostMapping
    Person create(@RequestBody Person body);

    @GetMapping("/{id}")
    Person findById(@PathVariable("id") String id);

    @GetMapping
    List<Person> findAll();

}