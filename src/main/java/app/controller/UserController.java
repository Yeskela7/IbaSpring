package app.controller;


import app.entity.Person;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
public class UserController {

    private UserService service;

    public UserController(@Autowired UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public Collection<Person> getAll() {
        return service.getAll();
    }

    @GetMapping
    public Person get(@PathVariable("id") int id) {
        return service.get(id);
    }

    @GetMapping("/user/add/{name}")
    public Person getPerson(@PathVariable("name") String name) {
        return service.create(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/add2/")
    public Person getPerson2(@PathParam("name") String name) {
        return service.create(name);
    }

}
