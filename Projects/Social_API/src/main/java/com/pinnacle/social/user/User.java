package com.pinnacle.social.user;

import java.util.HashMap;
import java.util.Map;

import com.pinnacle.social.locaion.Location;


public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Location location;

    public User(int id, String firstName, String lastName, String email, Location location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.location = location;
    }

    public void setAllData(int id, String firstName, String lastName, String email, Location location) {
        this.id =id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.location = location;
    }

    public int getId(){
        return this.id;
    }

    public String getEmail(){
        return this.email;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    
    public Map<String, Object> getAllDataAsMap() {
        Map<String, Object> userData = new HashMap<>();
        userData.put("firstName", this.firstName);
        userData.put("lastName", this.lastName);
        userData.put("email", this.email);
        userData.put("location", this.location);
        return userData;
    }
}
