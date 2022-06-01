
package ParkingSystem;

import java.util.ArrayList;

public class MangerScreen {
    ScreenController s = ScreenController.getInstance();

    MangerScreen() {

    }

    public void showMessagePopUp() {
    }

    public void showIncomeButton(){
        System.out.println("The total income till the current time = "+ s.showIncome());
    }

    public void showNumOfVehicleButton() {
        System.out.println("The number of vehicles that are currently in the garage = "+ s.showNumOfVehicle());
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