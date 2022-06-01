package ParkingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Instant;


public class VehicleCard {
    private String model, carNum, slotId;
    private int mYear, parkCost;
    private double width, depth;
    private Instant  timeIn, timeOut;

    VehicleCard() {
    }

    public void createForm(String model, String num, int year, double width, double depth, String slotID) {
        this.model = model;
        this.carNum = num;
        this.mYear = year;
        this.width = width;
        this.depth = depth;
        this.slotId = slotID;
        Instant  timeNow = Instant.now();
        this.timeIn = timeNow;
        ParkingMang.getInstance().addCar(this);
    }
    public String getSlotId(){return slotId;}
    public Instant getTimeIn(){return timeIn;}

}
