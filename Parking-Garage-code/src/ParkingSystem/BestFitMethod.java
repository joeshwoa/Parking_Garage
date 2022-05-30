package ParkingSystem;

import java.util.ArrayList;
import java.util.Objects;

public class BestFitMethod implements ParkingMethod {
    Slots slots = new Slots();
    public String park(double car_width, double car_depth){
        String suitableId = "No";
        double min_suitable_width = 1000, min_suitable_depth = 1000;
        //To search in the available slots only
        ArrayList<Slot> places = slots.GetAvailableSlots();
        for (int i = 0; i < places.size(); ++i) {
            //Check if the place dimensions greater or equal to the car dimensions.
            if (places.get(i).GetWidth() >= car_width && places.get(i).GetDepth() >= car_depth) {
                //to record the minimum place dimensions which is the suitable place for this car.
                if (places.get(i).GetWidth() < min_suitable_width && places.get(i).GetDepth() < min_suitable_depth) {
                    min_suitable_width = places.get(i).GetWidth();
                    min_suitable_depth = places.get(i).GetDepth();
                    suitableId = places.get(i).GetID();
                }
            }
        }

        //Mark the Selected Slot as unavailable.
        if (suitableId != "No") {
            for (int i = 0; i < places.size(); i++) {
                if (places.get(i).GetID() == suitableId) {
                    places.get(i).SetAval();
                    break;
                }
            }
        }
        //return PlaceID
        return suitableId;
    }
}
