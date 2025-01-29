package com.pin1.user;

import com.pin1.location.Location;

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
}
