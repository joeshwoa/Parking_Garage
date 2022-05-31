package ParkingSystem;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ParkingMang {
    private DateTimeFormatter timeIn, timeOut;
    private ArrayList<Long> inCome;
    private ArrayList<DateTimeFormatter> timeInCome, timeVechleNum;
    private BigInteger inComeHistoryLter;
    private static ArrayList<VehicleCard> cars = new ArrayList<VehicleCard>();
    private static int vehicleNumCom = 0;

    ParkingMang() {
    }
    public void addCar(VehicleCard vc){
        vehicleNumCom++;
        cars.add(vc);
    }

    /*public void removeCar(DateTimeFormatter time){

    }*/
    /*public void addInCome(DateTimeFormatter time ){

    }*/
    /*public Long getIncome(DateTimeFormatter time){

    }*/
    /*public void desForm(){

    }*/

    public int getNumOfVehicle (){
        return vehicleNumCom;
    }

}
