package GarageSystem;

import java.util.ArrayList;

public class Slots {
    private static int numFreePlaces;
    private double maxWidth;
    private double maxDepth;
    private double minWidth;
    private double minDepth;
    //Initialize the Garage structure (the places of the garage)
    private static ArrayList<Slot> places = new ArrayList<Slot>() {
        {
            //Primary Data to test
            /* add(new Slot(1.1, 2.7, "1A"));
            add(new Slot(1.5, 3, "1B"));
            add(new Slot(1.6, 2.9, "1C"));
            add(new Slot(1.1, 2.7, "1D"));
            add(new Slot(1.4, 3.2, "1E"));
            add(new Slot(1.7, 4, "1F"));
            add(new Slot(1.5, 3, "1J"));
            add(new Slot(1.7, 4, "1H"));
            add(new Slot(1.6, 2.9, "1I"));
            add(new Slot(1.4, 3.2, "1G")); */
        }
    };

    public Slots(){
        //the min width is 1 meter and max width is 1.7 meters
        minWidth = 1;
        maxWidth = 1.7;
        //the min depth is 2.7 meters and max depth is 4 meters
        minDepth = 2.7;
        maxDepth = 4;
    }

    public void SetSlotsDetails(double w, double d, String Id){
        places.add(new Slot(w, d, Id));
    }

    //It returns the first most suitable place to park-in
    public String Park_in(double car_width, double car_depth){
        String suitableId = "";
        double min_suitable_width = 1000, min_suitable_depth = 1000;
        for(int i = 0; i < places.size(); ++i){
            //Check if the place dimensions greater or equal to the car dimensions. 
            if(places.get(i).GetWidth() >= car_width && places.get(i).GetDepth() >= car_depth){
                //to record the minimum place dimensions wich is the suitable place for this car.
                if(places.get(i).GetWidth() < min_suitable_width && places.get(i).GetDepth() < min_suitable_depth){
                    min_suitable_width = places.get(i).GetWidth();
                    min_suitable_depth = places.get(i).GetDepth();
                    suitableId = places.get(i).GetID();
                }
            }
        }
        //return PlaceID
        return suitableId;
    }

    public ArrayList<Slot> GetAvailableSlots(){
        ArrayList<Slot> available = new ArrayList<Slot>();
        for(int i = 0; i < places.size(); i++){
            //If the place is available add it to the available array.
            if(places.get(i).IfAvail()){
                available.add(places.get(i));
            }
        }
        return available;
    }

    public void FreeSlot (String Id){
        //Next Phase
    }
}
