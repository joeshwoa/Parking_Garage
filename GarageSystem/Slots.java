package GarageSystem;

import java.util.ArrayList;

public class Slots {
    private static int numFreePlaces;
    private double maxWidth;
    private double maxDepth;
    private static ArrayList<Slot> places = new ArrayList<Slot>() {
        {
            add(new Slot(20, 40));
            add(new Slot(10, 20));
            add(new Slot(25, 50));
            add(new Slot(20, 40));
            add(new Slot(15, 30));
            add(new Slot(30, 60));
            add(new Slot(10, 20));
            add(new Slot(30, 60));
            add(new Slot(25, 50));
            add(new Slot(15, 30));
        }
    };;

    public Slots(){
        maxWidth = 30;
        maxDepth = 60;
    }

    //TODO
    public String Park_in(){
        
        //return PlaceID
        return "1A";
    }

    public ArrayList<Slot> GetAvailableSlots(){
        ArrayList<Slot> available = new ArrayList<Slot>();
        for(int i = 0; i < places.size(); i++){
            if(places.get(i).IfAvail()){
                available.add(places.get(i));
            }
        }
        return available;
    }
}
