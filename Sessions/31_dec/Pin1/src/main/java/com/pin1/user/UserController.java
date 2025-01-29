package com.pin1.user;

import org.springframework.web.bind.annotation.RestController;

import com.pin1.location.Location;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {

    @GetMapping("/getuser")
    public List<User> getMethodName() {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "Rami", "Collen", "rami@gmail.com", new Location(1, "Mumbai")));
        users.add(new User(2, "Alice", "Smith", "alice.smith@example.com", new Location(2, "New York")));
        users.add(new User(3, "John", "Doe", "john.doe@example.com", new Location(3, "London")));
        users.add(new User(4, "Sara", "Connor", "sara.connor@example.com", new Location(4, "Los Angeles")));
        users.add(new User(5, "Michael", "Brown", "michael.brown@example.com", new Location(5, "Toronto")));
        users.add(new User(6, "Emma", "Johnson", "emma.johnson@example.com", new Location(6, "Berlin")));
        return users;
        
    }
    
}
