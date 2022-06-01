package ParkingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Instant;


public class MachineController {
    private static MachineController single_instance = null;
    private GarageMachine garage = new GarageMachine();

    VehicleCard vehicleCard = new VehicleCard ();
    private MachineController(){

    }
    public static MachineController getInstance() {
        if(single_instance == null)
            single_instance = new MachineController();
        return single_instance;
    }
    public String sentInfo(String model, String carId, int mYear, double width, double depth, ParkingMethod method) {
        String sid = Slots.getInstance().parkIn(width, depth, method);
        //To create form for the car's that will park-in onl
        if(sid == "No") vehicleCard.createForm(model, carId, mYear, width, depth, sid);
        return sid;//sid
    }
    public int leave (String slotId) {
        Duration time = ParkingMang.getInstance().parkOut(slotId);
        double total = (double) time.toHours();
        int totalTime = (int) total + 1;
        ParkingMang.getInstance().addInCome(totalTime*5);
        return totalTime*5;//t*5
    }
    //checks if the money is enough or no
    public boolean check(double money,int parkCost)
    {
        if(money>=parkCost)
        {
            if (money>parkCost)
            {
                garage.returnChange(money-parkCost);
                return true;
            }
            if (money==parkCost)
            {
                System.out.println("thank you for use our garage :)");
                return true;
            }
        }
        else
        {
            garage.returnMoney(money);
            return false;
        }
        return false;
    }
}
