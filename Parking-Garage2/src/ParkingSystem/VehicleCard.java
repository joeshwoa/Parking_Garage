package ParkingSystem;

import java.time.format.DateTimeFormatter;

public class VehicleCard {
    private String model, carNum, slotId;
    private int mYear, parckCost;
    private double width, depth;
    private DateTimeFormatter timeIn, timeOut;

    VehicleCard() {
    }

    public void createForm(String model, String num, int year, double width, double depth, String slot) {
        this.model = model;
        this.carNum = num;
        this.mYear = year;
        this.width = width;
        this.depth = depth;
        this.slotId = slot;
    }
    /*public DateTimeFormatter Parkout(){

    }*/

}
