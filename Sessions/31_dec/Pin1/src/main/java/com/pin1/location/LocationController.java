package com.pin1.location;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
    
    @GetMapping("/location/get")
    public List<Location> getMethodName(@RequestParam String param) {
        List<Location> locations = new ArrayList<>();
        locations.add(new Location(1, "New York, USA"));
        locations.add(new Location(2, "London, UK"));
        locations.add(new Location(3, "Tokyo, Japan"));
        return locations;
    }
}
