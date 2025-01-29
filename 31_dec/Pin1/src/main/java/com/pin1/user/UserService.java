package com.pin1.user;

import java.util.Vector;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Vector<User> users;

    private UserService() {
        users = new Vector<User>();
    }

    // Add a user
    public Boolean addUser(User user) {
        users.add(user);
        return true;
    }

    // Get all users
    public Vector<User> getAllUsers() {
        return users;
    }

    // Get user by ID
    // public User getUserById(int id) {
    //     if (id >= 0 && id < users.size()) {
    //         return users.stream().filter(usr -> usr.ge).reduce((usr1, usr2)-> usr1.getId() == id ? usr1 : usr2).orElse(null);
    //     }
    //     return null;
    // }

    // Update user by ID
    public boolean updateUserById(int id, User updatedUser ) {
            if (id >= 0 && id < users.size()) {
                users.set(id, updatedUser );
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
