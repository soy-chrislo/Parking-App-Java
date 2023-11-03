package com.soychristian.entities;

public class ParkingSlotManager {
    private ParkingSlot[] parkingSlots;

    public ParkingSlotManager(ParkingSlot[] parkingSlots) {
        this.parkingSlots = parkingSlots;
        // * Es importante inicializar los parking slots para que no sean null.
        inicializeParkingSlots();
    }

    public void inicializeParkingSlots() {
        for (int i = 0; i < this.parkingSlots.length; i++) {
            this.parkingSlots[i] = new ParkingSlot();
        }
    }

    public ParkingSlot[] getParkingSlots() {
        return this.parkingSlots;
    }

    public void setParkingSlots(ParkingSlot[] parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public ParkingSlot getParkingSlot(int index) {
        return this.parkingSlots[index];
    }

    public void setParkingSlot(int index, ParkingSlot parkingSlot) {
        this.parkingSlots[index] = parkingSlot;
    }

    public void addParkingSlot(ParkingSlot parkingSlot) {
        ParkingSlot[] newParkingSlots = new ParkingSlot[this.parkingSlots.length + 1];
        for (int i = 0; i < this.parkingSlots.length; i++) {
            newParkingSlots[i] = this.parkingSlots[i];
        }
        newParkingSlots[this.parkingSlots.length] = parkingSlot;
        this.parkingSlots = newParkingSlots;
    }

    public void removeParkingSlot(int index) {
        ParkingSlot[] newParkingSlots = new ParkingSlot[this.parkingSlots.length - 1];
        for (int i = 0; i < this.parkingSlots.length; i++) {
            if (i != index) {
                newParkingSlots[i] = this.parkingSlots[i];
            }
        }
        this.parkingSlots = newParkingSlots;
    }

    public void removeParkingSlot(ParkingSlot parkingSlot) {
        ParkingSlot[] newParkingSlots = new ParkingSlot[this.parkingSlots.length - 1];
        for (int i = 0; i < this.parkingSlots.length; i++) {
            if (this.parkingSlots[i] != parkingSlot) {
                newParkingSlots[i] = this.parkingSlots[i];
            }
        }
        this.parkingSlots = newParkingSlots;
    }
}
