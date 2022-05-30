package ParkingSystem;

import java.util.ArrayList;

public class Slots {
    private static int numFreePlaces;
    private double maxWidth;
    private double maxDepth;
    private double minWidth;
    private double minDepth;
    //Initialize the Garage structure (the places of the garage)
    private static ArrayList<Slot> places = new ArrayList<Slot>() {{
        add(new Slot(1.1, 2.7, "1A"));
        add(new Slot(1.5, 3, "1B"));
        add(new Slot(1.6, 2.9, "1C"));
        add(new Slot(1.1, 2.7, "1D"));
        add(new Slot(1.4, 3.2, "1E"));
        add(new Slot(1.7, 4, "1F"));
        add(new Slot(1.5, 3, "1J"));
        add(new Slot(1.7, 4, "1H"));
        add(new Slot(1.6, 2.9, "1I"));
        add(new Slot(1.4, 3.2, "1G"));
    }};

    public Slots() {
        //the min width is 1 meter and max width is 1.7 meters
        minWidth = 1;
        maxWidth = 1.7;
        //the min depth is 2.7 meters and max depth is 4 meters
        minDepth = 2.7;
        maxDepth = 4;
        /**/
    }

    public void clear() {
        places.clear();
    }

    public void SetSlotsDetails(double w, double d, String Id) {
        //validate the width and depth sizes
        if(w > maxWidth || w < minWidth){
            System.out.println("Invalid width");
        }else if(d > maxDepth || d < minDepth){
            System.out.println("Invalid depth");
        }else{
            places.add(new Slot(w, d, Id));
        }
    }

    //It returns the first most suitable place to park-in
    public String parkIn(double car_width, double car_depth, ParkingMethod method) {
        return method.park(car_width, car_depth);
    }

    public ArrayList<Slot> GetAvailableSlots() {
        ArrayList<Slot> available = new ArrayList<Slot>();
        for (int i = 0; i < places.size(); i++) {
            //If the place is available add it to the available array.
            if (places.get(i).IfAvail()) {
                available.add(places.get(i));

            }
        }

        return available;
    }

    public void FreeSlot(String Id) {
        //Next Phase
    }
}
