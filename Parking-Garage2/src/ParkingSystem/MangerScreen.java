
package ParkingSystem;

import java.util.ArrayList;

public class MangerScreen {

    /**
     *
     */
    ScreenController s = new ScreenController();
    MangerScreen(){

    }

    public void showMassagePupup() {
    }

    public void showIncomeButton(/*data time formatter*/) {
        long inco;

        inco = s.showIncome(/*data time formatter*/);

    }

    public void showNumOfVehicleButton(/*data time formatter*/) {
        int num = 0;
        num = s.showNumOfVehicle();
    }

    public void showAvalSlotsButton() {
        ArrayList<Slot> Aval = s.showAvalSlots();

        for (int i=0;i< Aval.size();i++){
            System.out.println(Aval.get(i).GetID());
        }

    }
    public void  EnterSlotsDetailsButton(){
        s.EnterSlotsDetails();
    }
}