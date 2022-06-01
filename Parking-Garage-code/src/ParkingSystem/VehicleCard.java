package ParkingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Instant;


public class VehicleCard {
    private String model, carNum, slotId;
    private int mYear, parckCost;
    private double width, depth;
    private Instant  timeIn, timeOut;

    private ParkingMang parkingManager = ParkingMang.getInstance();

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
        //to format time
        /*DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = timNow.format(formatTime);*/
        this.timeIn = timeNow;
        parkingManager.addCar(this);
    }
    public String getSlotId(){return slotId;}
    public Instant getTimeIn(){return timeIn;}

}
