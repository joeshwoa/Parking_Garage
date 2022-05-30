package ParkingSystem;

import java.util.ArrayList;

public class FirstComeMethod implements ParkingMethod {

    Slots slots = new Slots();
    public String park(double car_width, double car_depth){
        ArrayList<Slot> places = slots.getAvailableSlots();
        String firstFit = "";
        for(int i = 0; i < places.size(); ++i){
            if(places.get(i).GetWidth() >= car_width && places.get(i).GetDepth() >= car_depth){
                firstFit = places.get(i).GetID();
                break;
            }
        }
        return firstFit;
    }
}
