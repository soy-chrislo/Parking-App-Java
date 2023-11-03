package com.soychristian.entities;

public class ParkingSlotManager {
    private ParkingSlot[] parkingSlots;

    public ParkingSlotManager(ParkingSlot[] parkingSlots) {
        this.parkingSlots = parkingSlots;
        // * Es importante inicializar los parking slots para que no sean null.
        inicializeParkingSlots();
    }

    /**
     * Inicialize the parking slots.
     */
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

    /**
     * Set the parking slot in the index.
     * @param index index of the parking slot
     * @param parkingSlot parking slot to set
     */
    public void setParkingSlot(int index, ParkingSlot parkingSlot) {
        this.parkingSlots[index] = parkingSlot;
    }

    /**
     * Add a parking slot to the parking slots. Modify the parking slots array.
     * @param parkingSlot parking slot to add
     */
    public void addParkingSlot(ParkingSlot parkingSlot) {
        ParkingSlot[] newParkingSlots = new ParkingSlot[this.parkingSlots.length + 1];
        for (int i = 0; i < this.parkingSlots.length; i++) {
            newParkingSlots[i] = this.parkingSlots[i];
        }
        newParkingSlots[this.parkingSlots.length] = parkingSlot;
        this.parkingSlots = newParkingSlots;
    }


    /**
     * Remove a parking slot from the parking slots. Modify the parking slots array.
     * @param index index of the parking slot to remove
     */
    public void removeParkingSlot(int index) {
        ParkingSlot[] newParkingSlots = new ParkingSlot[this.parkingSlots.length - 1];
        for (int i = 0; i < this.parkingSlots.length; i++) {
            if (i != index) {
                newParkingSlots[i] = this.parkingSlots[i];
            }
        }
        this.parkingSlots = newParkingSlots;
    }

    /**
     * Remove a parking slot from the parking slots. Modify the parking slots array.
     * @param parkingSlot parking slot to remove
     */
    public void removeParkingSlot(ParkingSlot parkingSlot) {
        ParkingSlot[] newParkingSlots = new ParkingSlot[this.parkingSlots.length - 1];
        for (int i = 0; i < this.parkingSlots.length; i++) {
            if (this.parkingSlots[i] != parkingSlot) {
                newParkingSlots[i] = this.parkingSlots[i];
            }
        }
        this.parkingSlots = newParkingSlots;
    }

    /**
     * Clear the parking slot in the index, create new instance.
     * @param index index of the parking slot to clear
     */
    public void clearParkingSlot(int index) {
        this.parkingSlots[index] = new ParkingSlot();
    }

    /**
     * Clear all the parking slots, create new instances.
    */
    public void clearAllParkingSlots() {
        for (int i = 0; i < this.parkingSlots.length; i++) {
            this.parkingSlots[i] = new ParkingSlot();
        }
    }
}
