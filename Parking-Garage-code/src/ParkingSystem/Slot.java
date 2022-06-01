package ParkingSystem;

public class Slot {
    private double width;
    private double depth;
    private String SlotId = "1A";
    private boolean Available;

    public Slot(double w, double d, String Id) {
        width = w;
        depth = d;
        Available = true;
        SlotId = Id;
    }

    //Flip the bool Available if true it will be false and vice versa
    public void SetAval() {
        Available ^= true;
    }

    public double GetWidth() {
        return width;
    }

    public double GetDepth() {
        return depth;
    }

    public String GetID() {
        return SlotId;
    }
    //public String getSlotId(){return SlotId;}

    public boolean IfAvail() {
        return Available;
    }
}