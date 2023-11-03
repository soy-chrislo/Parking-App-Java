package com.soychristian.entities;

import java.util.UUID;

import com.soychristian.interfaces.Id;

public class Parking implements Id {
    private UUID id;
    private String name;
    private ParkingSlot[] parkingSlots;
    private ParkingSlotManager parkingSlotManager;

    public Parking(String name, int parkingSlots) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.parkingSlots = new ParkingSlot[parkingSlots];
        this.parkingSlotManager = new ParkingSlotManager(this.parkingSlots);
        System.out.println(this.parkingSlotManager.getParkingSlot(0).getId());
    }

    // * ID

    @Override
    public UUID getId() {
        return this.id;
    }

    // * NAME

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // * PARKING SLOTS

    public ParkingSlot[] getParkingSlots() {
        return this.parkingSlots;
    }
    
}
