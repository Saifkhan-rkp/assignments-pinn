package com.pin1.user;

import com.pin1.location.LocationRecord;

public record UserRecord(int id, String name, String email, LocationRecord location) {
    
}
