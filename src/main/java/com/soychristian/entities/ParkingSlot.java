package com.soychristian.entities;

import java.util.UUID;

import com.soychristian.enums.DisponibilityParkingSlot;
import com.soychristian.interfaces.Id;

public class ParkingSlot implements Id {
    private final UUID id;
    private DisponibilityParkingSlot disponibility;
    private Car car;

    public ParkingSlot() {
        this.id = UUID.randomUUID();
        this.disponibility = DisponibilityParkingSlot.AVAILABLE;
    }

    // * ID
    
    @Override
    public UUID getId() {
        return this.id;
    }

    // * Disponibility

    public DisponibilityParkingSlot getDisponibility() {
        return this.disponibility;
    }

    public void setDisponibility(DisponibilityParkingSlot disponibility) {
        this.disponibility = disponibility;
    }

    // * Car

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
