package com.pinnacle.social.user;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.pinnacle.social.locaion.Location;

@Service
public class UserService {
    private List<User> users;

    private UserService() {
        users = new ArrayList<User>();
        users.add(new User(1, "Rami", "Collen", "rami@gmail.com", new Location(1, "Mumbai")));
        users.add(new User(2, "Alice", "Smith", "alice.smith@example.com", new Location(2, "New York")));
        users.add(new User(3, "John", "Doe", "john.doe@example.com", new Location(3, "London")));
        users.add(new User(4, "Sara", "Connor", "sara.connor@example.com", new Location(4, "Los Angeles")));
        users.add(new User(5, "Michael", "Brown", "michael.brown@example.com", new Location(5, "Toronto")));
        users.add(new User(6, "Emma", "Johnson", "emma.johnson@example.com", new Location(6, "Berlin")));
    }

    // Add a user
    public Boolean addUser(User user) {
        users.add(user);
        return true;
    }

    public List<User> getAllUsers() {
        return users;
    }

    // Get user by ID
    public User getUserById(int id) {
        if (id >= 0 && id < users.size()) {
            return users.stream().filter(usr -> usr.getId() == id)
                    .findFirst().orElse(null);
        }
        return null;
    }

    // Update user by ID
    public boolean updateUserById(int id, User updatedUser) {
        if (id >= 0 && id < users.size()) {
            users.set(id, updatedUser);
            return true;
        }
        return false;
    }

    // Delete user by ID
    public boolean deleteUserById(int id) {
        if (id >= 0 && id < users.size()) {
            users.remove(id);
            return true;
        }
        return false;
    }

    // Search user by email
    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    // Clear all users
    public void clearAllUsers() {
        users.clear();
    }
}
