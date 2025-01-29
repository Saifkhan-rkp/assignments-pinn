package com.pinnacle.social.user;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.pinnacle.social.locaion.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") String id) {
		return userService.getUserById(Integer.parseInt(id));
	}
	
    @GetMapping("/users")
    public List<User> getMethodName() {
        return userService.getAllUsers();
        
    }
    
	@RequestMapping("/user")
	public String userAlive() {
		return "User route is alive";
	}

}
