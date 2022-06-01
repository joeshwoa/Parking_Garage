package ParkingSystem;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ParkingMang {
    private static ParkingMang PM;
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
        if(PM==null)
            PM= new ParkingMang();
        return PM;
    }
    /*public void removeCar(DateTimeFormatter time){

    }*/
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
