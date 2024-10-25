package com.example.Spliter.Expenses.Software.Services.Implement;

import com.example.Spliter.Expenses.Software.CreateRepo.CreationRepo;
import com.example.Spliter.Expenses.Software.Entity.Trip;
import com.example.Spliter.Expenses.Software.Services.CreateServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateServiceImplementation implements CreateServiceInterface {

    @Autowired
    CreationRepo creationRepo;

    @Override
    public String createTrip(Trip trip) {
        creationRepo.save(trip);
        return "succesfully trip saved -->have fun,<--";
    }

//    @Override
//    public List<Trip> getTrip() {
//        return List.of();
//    }

    @Override
    public List<Trip> getTrip() {
        return creationRepo.findAll();
    }

}
