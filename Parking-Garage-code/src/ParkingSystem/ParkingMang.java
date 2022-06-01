package ParkingSystem;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.Duration;
import java.time.Instant;

public class ParkingMang {
    private static ParkingMang single_instance = null;
    private static int cumulativeIncome = 0;
    private static ArrayList<VehicleCard> cars = new ArrayList<VehicleCard>();
    private static int vehicleNumCom = 0;

    private ParkingMang() {
    }

    public void addCar(VehicleCard vc){
        vehicleNumCom++;
        cars.add(vc);
    }

    public static ParkingMang getInstance()
    {
        if(single_instance == null)
            single_instance = new ParkingMang();
        return single_instance;
    }
    public Duration  parkOut(String slotId) {
        Instant  timeOut = Instant .now();
        int temp=0;//index of car
        for(int i=0;i<cars.size();i++){
            if(cars.get(i).getSlotId()==slotId){
                temp =i;
                break;
            }
        }
        Instant timeIn = cars.get(temp).getTimeIn();
        Duration time = Duration.between(timeIn,timeOut);
        removeCar(slotId);
        time.toHours();
        return time;
    }

    public void removeCar(String slotId) {
        //search for the target slot to remove it
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getSlotId() == slotId) {
                cars.remove(i);
                break;
            }

        }
        Slots slotsObj = Slots.getInstance();
        slotsObj.freeSlot(slotId);
    }
    //to add on the cumulative income.
    public void addInCome(int income){
        cumulativeIncome+=income;
    }
    public int getIncome(){
        return cumulativeIncome;
    }

    public int getNumOfVehicle (){
        return vehicleNumCom;
    }

}
