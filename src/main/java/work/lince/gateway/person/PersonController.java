package work.lince.gateway.person;

import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/gateway/people", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {

    @Autowired
    protected PersonClientService service;

    @Timed("lince.gateway.people.find-all")
    @GetMapping
    public List<Person> findAll() {
        return service.findAll();
    }

    @Timed("lince.gateway.people.create")
    @PostMapping
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @Timed("lince.gateway.people.find-by-id")
    @GetMapping("/{id}")
    public Person findById(@PathVariable(value = "id") String id) {
        return service.findById(id);
    }
}