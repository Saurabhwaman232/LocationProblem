package com.example.location_problem;

import com.example.location_problem.UserLocation;
import com.example.location_problem.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create_data")
    public ResponseEntity<UserLocation> createData(@RequestBody UserLocation userLocation) {
        UserLocation createdUserLocation = userService.createLocation(userLocation);
        return ResponseEntity.ok(createdUserLocation);
    }

    @PatchMapping("/update_data")
    public ResponseEntity<UserLocation> updateData(@RequestBody UserLocation userLocation) {
        UserLocation updatedUserLocation = userService.updateLocation(userLocation);
        return ResponseEntity.ok(updatedUserLocation);
    }

    @GetMapping("/get_users/{count}")
    public ResponseEntity<List<UserLocation>> getUsers(@PathVariable int count) {
        List<UserLocation> nearestUsers = userService.getNearestUsers(count);
        return ResponseEntity.ok(nearestUsers);
    }
}

