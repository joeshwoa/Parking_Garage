package ParkingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MachineController {
    //private  String m,cid;
    //private  int y;
    //private  double w,d;
    private static MachineController mc;
    private  ParkingMang manage = ParkingMang.getInstance();
    private GarageMachine grage = new GarageMachine();


    //private  GarageMachine gm = new GarageMachine();
    VehicleCard vc = new VehicleCard ();
    // ParkingMang pm = new ParkingMang();
    private MachineController() {

    }
    public static MachineController getInstance()
    {
        if(mc==null)
            mc= new MachineController();
        return mc;
    }
    public String sentInfo(String model, String carId, int mYear, double width, double depth, ParkingMethod method) {
        String sid = Slots.getInstance().parkIn(width, depth, method);
        vc.createForm(model, carId, mYear, width, depth, sid);
        return sid;//sid
    }
    public int leave (String slotId)
    {

        LocalDateTime timNow = LocalDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = timNow.format(formatTime);
        manage.parkOut(slotId);
        // return times
        // calculate fees
        return 0;//t*5
    }
    public void check(double money,int parkCost)
    {
        if(money>=parkCost)
        {
            if (money>parkCost)
            {
                grage.returnChange(money-parkCost);
            }
            if (money==parkCost)
            {
                System.out.println("thank you for use our garage :)");
            }
        }
        else
        {
            grage.returnMoney(money);
        }
    }
}
