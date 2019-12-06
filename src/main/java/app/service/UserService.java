package app.service;

import app.entity.Person;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class UserService {

    private Map<Integer, Person> data = new HashMap<>();

    public UserService() {
        data.put(1,new Person("Jim"));
        data.put(2,new Person("Samanta"));
    }

    public Collection<Person> getAll(){
        return data.values();
    }

    public Person get(int id){
        return data.get(id);
    }

    public Person create(String name){
        Person person = new Person(name);
        return data.put(data.size()+1, person);
    }

}
