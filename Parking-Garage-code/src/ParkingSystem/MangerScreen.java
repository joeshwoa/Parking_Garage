
package ParkingSystem;

import java.util.ArrayList;

public class MangerScreen {
    ScreenController s = new ScreenController();

    MangerScreen() {

    }

    public void showMessagePopUp() {
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
        ArrayList<Slot> Aval = s.showAvailSlots();

        for (int i = 0; i < Aval.size(); i++) {
            System.out.println(Aval.get(i).GetID());
        }

        if (Aval.size() == 0) {
            System.out.println("No Avaliable Slots");
        }

    }

    public void enterSlotsDetailsButton() {
        s.enterSlotsDetails();
    }
}