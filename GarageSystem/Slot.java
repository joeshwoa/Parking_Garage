package GarageSystem;

public class Slot{
    private double width;
    private double depth;
    private String SlotId;
    private boolean Available;

    public double GetWidth(){
        return width;
    }

    public double GetDepth(){
        return depth;
    }

    public String GetID(){
        return SlotId;
    }

    public boolean IfAvail(){
        return Available;
    }
}