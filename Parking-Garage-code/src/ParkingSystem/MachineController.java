package ParkingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Instant;


public class MachineController {
    private static MachineController mc = null;
    private  ParkingMang manage = ParkingMang.getInstance();
    private GarageMachine grage = new GarageMachine();

    VehicleCard vc = new VehicleCard ();
    private MachineController() {

    }
    public static MachineController getInstance()
    {
        if(mc == null)
            mc = new MachineController();
        return mc;
    }
    public String sentInfo(String model, String carId, int mYear, double width, double depth, ParkingMethod method) {
        String sid = Slots.getInstance().parkIn(width, depth, method);
        if(sid == "No") vc.createForm(model, carId, mYear, width, depth, sid);
        return sid;//sid
    }
    public int leave (String slotId)
    {

        LocalDateTime timNow = LocalDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = timNow.format(formatTime);
        Duration time =manage.parkOut(slotId);
        double total = (double) time.toHours();
        int totalTime = (int) total + 1;
        manage.addInCome(totalTime*5);
        return totalTime*5;//t*5
    }
    public boolean check(double money,int parkCost)
    {
        if(money>=parkCost)
        {
            if (money>parkCost)
            {
                grage.returnChange(money-parkCost);
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
            grage.returnMoney(money);
            return false;
        }
        return false;
    }
}
