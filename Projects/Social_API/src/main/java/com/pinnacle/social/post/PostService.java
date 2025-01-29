package com.pinnacle.social.post;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.social.locaion.Location;
import com.pinnacle.social.user.User;

@Service
public class PostService {

    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        User user1 = new User(1, "Rami", "Collen", "rami@gmail.com", new Location(1, "Mumbai"));
        User user2 = new User(2, "Alice", "Smith", "alice.smith@example.com", new Location(2, "New York"));
        posts.add(new Post(1, "Spring Boot Basics", "Learn the basics of Spring Boot", "2025-01-01", user1));
        posts.add(new Post(2, "Advanced Java", "Explore advanced Java concepts", "2025-01-02", user2));
    }

    public List<Post> getAllPosts() {
        return posts;
    }

    public Post getPostById(int id) {
        if (id >= 0) {
            return posts.stream()
                    .filter(post -> post.getId() == id)
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }
}
