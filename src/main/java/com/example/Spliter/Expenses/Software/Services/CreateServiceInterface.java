package com.example.Spliter.Expenses.Software.Services;

import com.example.Spliter.Expenses.Software.Entity.Trip;

import java.awt.*;
import java.util.List;

public interface CreateServiceInterface {



    public String createTrip(Trip trip);

    public List<Trip> getTrip();
}
