package com.janejsmund.location.services;

import com.janejsmund.location.entities.Location;
import com.janejsmund.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public LocationRepository getLocationRepository() {
        return locationRepository;
    }

    public void setLocationRepository(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location saveLocation(Location location) {
        locationRepository.save(location);
        return location;
    }

    @Override
    public Location updateLocation(Location location) {
        locationRepository.save(location);
        return location;
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);
    }

    @Override
    public Location getLocationById(long id) {

        if (locationRepository.findById(id).isPresent()) {
            return locationRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<Location> getAllLocations() {

        List<Location> list = new ArrayList<>();
        for(Location loc: locationRepository.findAll()) {
            list.add(loc);
        }
        return list;
    }
}
