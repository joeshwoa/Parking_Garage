import java.time.format.DateTimeFormatter;

public class VehicleCard {
    private String model,carNum,slotId;
    private  int mYear,parckCost;
    private  double width,depth;
    private  DateTimeFormatter timeIn,timeOut;
    public String createForm(String model ,String num ,int year, double width,double depth,String slot){
        this.model=model;
        this.carNum=num;
        this.mYear=year;
        this.width=width;
        this.depth=depth;
        this.slotId=slot;
        return "??";
    }
    /*public DateTimeFormatter Parkout(){

    }*/
    public void desForm(){

    }
}
