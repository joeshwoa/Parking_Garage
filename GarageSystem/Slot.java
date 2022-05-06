package GarageSystem;

public class Slot{
    private double width;
    private double depth;
    private String SlotId = "1A";
    private boolean Available;

    public Slot(double w, double d){
        width = w;
        depth = d;
        Available = true;
    }

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