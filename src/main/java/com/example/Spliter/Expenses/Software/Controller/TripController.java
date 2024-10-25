package com.example.Spliter.Expenses.Software.Controller;


import com.example.Spliter.Expenses.Software.Entity.Trip;
import com.example.Spliter.Expenses.Software.Services.CreateServiceInterface;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("Trip/")
public class TripController {

    @Autowired
    private CreateServiceInterface createServiceInterface;



    // Trip/Create/
    @PostMapping("Create/")
    String createTrip(@Valid @RequestBody Trip trip){
        return createServiceInterface.createTrip(trip);

    }

    @GetMapping("muni/")
    public List<Trip> getTrips(){
        log.info("hiiii");
        return createServiceInterface.getTrip();
    }


}
