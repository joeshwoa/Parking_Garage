package ParkingSystem;

import java.util.ArrayList;

class Slots {
    private static int numFreePlaces;
    private double maxWidth;
    private double maxDepth;
    private double minWidth;
    private double minDepth;

    //To apply the singleton design pattern
    private static Slots single_instance = null;

    //Initialize the Garage structure (the places of the garage)
    private static ArrayList<Slot> places = new ArrayList<Slot>() {{
        add(new Slot(1.1, 2.7, "1A"));
        add(new Slot(1.5, 3.2, "1B"));
        add(new Slot(1.6, 2.9, "1C"));
        add(new Slot(1.1, 2.7, "1D"));
        add(new Slot(1.4, 3.2, "1E"));
        add(new Slot(1.7, 4, "1F"));
        add(new Slot(1.5, 3, "1J"));
        add(new Slot(1.7, 4, "1H"));
        add(new Slot(1.6, 2.9, "1I"));
        add(new Slot(1.4, 3.2, "1G"));
    }};

    private Slots() {
        //the min width is 1 meter and max width is 1.7 meters
        minWidth = 1;
        maxWidth = 1.7;
        //the min depth is 2.7 meters and max depth is 4 meters
        minDepth = 2.7;
        maxDepth = 4;
        /**/
    }

    public void clearPlaces() {
        places.clear();
    }

    public boolean setSlotsDetails(double w, double d, String Id) {
        for (int i = 0; i < places.size(); i++) {
            //search if there exists a slot with the same ID.
            if ((places.get(i).GetID()).equals(Id)) {
                return false;
            }
        }

        //validate the width and depth sizes
        if(w > maxWidth || w < minWidth){
            System.out.println("Invalid width");
            return false;
        }else if(d > maxDepth || d < minDepth){
            System.out.println("Invalid depth");
            return false;
        }else{
            places.add(new Slot(w, d, Id));
        }
        return true;
    }

    //It returns the first most suitable place to park-in
    public String parkIn(double car_width, double car_depth, ParkingMethod method) {
        return method.park(car_width, car_depth);
    }

    public ArrayList<Slot> getAvailableSlots() {
        ArrayList<Slot> available = new ArrayList<Slot>();
        for (int i = 0; i < places.size(); i++) {
            //If the place is available add it to the available array.
            if (places.get(i).IfAvail()) {
                available.add(places.get(i));

            }
        }
        return available;
    }

    public void freeSlot(String Id) {
        for (int i = 0; i < places.size(); i++) {
            //search the place with the given id and toggle th availability
            if ((places.get(i).GetID()).equals(Id)) {
                places.get(i).SetAval();
            }
        }
    }

    public static Slots getInstance() {
        if (single_instance == null)
            single_instance = new Slots();

        return single_instance;
    }
}
