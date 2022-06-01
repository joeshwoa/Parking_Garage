package ParkingSystem;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ParkingMang {
    private static ParkingMang pm;
    private static Long cumulativeIncome;
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
        if(pm==null)
            pm= new ParkingMang();
        return pm;
    }
    public void/*LocalDateTime*/ parkOut(String slotId) {
        //LocalDateTime now = ;
        removeCar(slotId);
        return ;
    }

    public void removeCar(String slotId) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getSlotId() == slotId) {
                cars.remove(i);
                break;
            }

        }
        Slots slotsObj = Slots.getInstance();
        slotsObj.freeSlot(slotId);
    }
    /*public void addInCome(DateTimeFormatter time){

    }*/
    public Long getIncome(){
        return cumulativeIncome;
    }
    /*public void desForm(){

    }*/

    public int getNumOfVehicle (){
        return vehicleNumCom;
    }

}
