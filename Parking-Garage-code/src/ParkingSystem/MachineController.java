package ParkingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MachineController {
    //private  String m,cid;
    //private  int y;
    //private  double w,d;
    private Slots s = new Slots();

    //private  GarageMachine gm = new GarageMachine();
    // Slots s = new Slots ();
    // VehicleCard vc = new VehicleCard ();
    // ParkingMang pm = new ParkingMang();
    MachineController() {

    }

    public String sentInfo(String model, String carId, int mYear, double width, double depth, ParkingMethod method) {
        String sid = s.parkIn(width, depth, method);
        return sid;//sid
    }
    /*public int Leave (String soltId)
    {
        LocalDateTime timNow = LocalDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = timNow.format(formatTime);
        //LocalDateTime t =s.FreeSlot (width,depth);
        //t=HH;
        //if(mm!=0)t++;
        return 0;//t*5
    }*/
    /*public String check(int money,int parkCost,String slotId)
    {
        if(money>=parkCost)
        {
            //vc.DesForm(slotId);
            if (money>parkCost)
            {
                gm.ReturnChange(money-parkCost);
                return("thank you for use our garage :)");
            }
            if (money==parkCost)
            {
                return("thank you for use our garage :)");
            }
        }
        else
        {
            //pm.NoManey();
            gm.ReturnMoney(money);
            return("Manger will come for you");
        }
    }*/
}
