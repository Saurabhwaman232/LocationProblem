package com.example.location_problem;

import com.example.location_problem.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {

    @Query("SELECT u FROM UserLocation u WHERE u.excluded = false " +
            "ORDER BY SQRT(u.latitude * u.latitude + u.longitude * u.longitude)")
    List<UserLocation> findNearestUsers(int count);
}