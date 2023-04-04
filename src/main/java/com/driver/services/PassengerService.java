package com.driver.services;


import com.driver.model.Passenger;
import com.driver.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    public Integer addPassenger(Passenger passenger){
        //Add the passenger Object in the passengerDb and return the passegnerId that has been returned
        Passenger passenger1=new Passenger();
        passenger1.setName(passenger.getName());
        passenger1.setAge(passenger.getAge());
        passenger1.setBookedTickets(new ArrayList<>());
        passengerRepository.save(passenger1);
        return passenger1.getPassengerId();
    }

}