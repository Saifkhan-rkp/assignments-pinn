package com.pin1.location;

import java.util.ArrayList;
import java.util.List;

public class LocationService {
    private List<Location> locations;

    public LocationService(){
        locations = new ArrayList<>();
    }
    public List <Location> getLocations() {
        return locations;
    }
}
