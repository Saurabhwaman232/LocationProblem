package com.example.location_problem;

import com.example.location_problem.UserLocation;
import com.example.location_problem.UserLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserLocationRepository userLocationRepository;

    public UserLocation createLocation(UserLocation userLocation) {
        return userLocationRepository.save(userLocation);
    }

    public UserLocation updateLocation(UserLocation userLocation) {
        return userLocationRepository.save(userLocation);
    }

    public List<UserLocation> getNearestUsers(int count) {
        // Implement logic to retrieve nearest users from the location (0,0)
        // and filter out excluded users
        // You'll need to write this logic based on your requirements and data model
        // For demonstration purposes, let's assume you have a method in userLocationRepository
        // that returns the nearest users
        return userLocationRepository.findNearestUsers(count);
    }
}
