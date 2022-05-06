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
            add(new Slot(1.1, 2.7));
            add(new Slot(1.5, 3));
            add(new Slot(1.6, 2.9));
            add(new Slot(1.1, 2.7));
            add(new Slot(1.4, 3.2));
            add(new Slot(1.7, 4));
            add(new Slot(1.5, 3));
            add(new Slot(1.7, 4));
            add(new Slot(1.6, 2.9));
            add(new Slot(1.4, 3.2));
        }
    };;

    public Slots(){
        //the min width is 1 meter and max width is 1.7 meters
        minWidth = 1;
        maxWidth = 1.7;
        //the min depth is 2.7 meters and max depth is 4 meters
        minDepth = 2.7;
        maxDepth = 4;
    }

    //TODO
    public String Park_in(){
        
        //return PlaceID
        return "1A";
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
}
