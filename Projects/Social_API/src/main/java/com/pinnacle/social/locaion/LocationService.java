package com.pinnacle.social.locaion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {
    private List<Location> locations;

    public LocationService() {
        locations = new ArrayList<>();
        locations.add(new Location(1, "New York, USA"));
        locations.add(new Location(2, "London, UK"));
        locations.add(new Location(3, "Tokyo, Japan"));

    }

    public List<Location> getAlLocations(){
        return locations;
    }

    public Location getLocationById(int id) {
        if (id >= 0) {
            return locations.stream()
                    .filter(post -> post.getId() == id)
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public void addLocation(Location location) {

        locations.add(location);
    }
}
