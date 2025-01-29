package com.pinnacle.social.locaion;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
public class LocationController {
    
    @Autowired
    LocationService locationService;

    @GetMapping("/locations")
    public List<Location> getMethodName() {
        return locationService.getAlLocations();
    }

    @GetMapping("/location/{id}")
    public Location getLocationById(@PathVariable("id") String id) {
        return locationService.getLocationById(Integer.parseInt(id));
    }
    
    @PostMapping("/location/add")
    public void addLocation(@RequestBody Location body) {
        locationService.addLocation(body);
    }
    
    
}
