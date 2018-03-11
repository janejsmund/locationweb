package com.janejsmund.location.services;

import com.janejsmund.location.entities.Location;

import java.util.List;

public interface LocationService {

    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(Location location);
    Location getLocationById(long id);
    List<Location> getAllLocations();
}
