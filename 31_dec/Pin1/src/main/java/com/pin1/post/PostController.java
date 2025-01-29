package com.pin1.post;

import org.springframework.web.bind.annotation.RestController;

import com.pin1.user.User;
import com.pin1.location.Location;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PostController {
    @RequestMapping("/posts")
    public List<Post> getMethodName(@RequestParam String param) {
        User user1 = new User(1, "Rami", "Collen", "rami@gmail.com", new Location(1, "Mumbai"));
        User user2 = new User(2, "Alice", "Smith", "alice.smith@example.com", new Location(2, "New York"));

        // Create dummy Post objects
        Post post1 = new Post(1, "Spring Boot Basics", "Learn the basics of Spring Boot", "2025-01-01", user1);
        Post post2 = new Post(2, "Advanced Java", "Explore advanced Java concepts", "2025-01-02", user2);

        // Add posts to an ArrayList
        List<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        
        return posts;
    }
    
}
