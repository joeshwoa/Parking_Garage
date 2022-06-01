
package ParkingSystem;

import java.util.ArrayList;

public class MangerScreen {
    MangerScreen() {

    }

    public void showIncomeButton(){
        System.out.println("The total income till the current time = "+ ScreenController.getInstance().showIncome());
    }

    public void showNumOfVehicleButton() {
        System.out.println("The number of vehicles that are currently in the garage = "+ ScreenController.getInstance().showNumOfVehicle());
    }

    public void showAvalSlotsButton() {
        ArrayList<Slot> Aval = ScreenController.getInstance().showAvailSlots();

        for (int i = 0; i < Aval.size(); i++) {
            System.out.println(Aval.get(i).GetID());
        }

        if (Aval.size() == 0) {
            System.out.println("No Avaliable Slots");
        }

    }

    public void enterSlotsDetailsButton() {
        ScreenController.getInstance().enterSlotsDetails();
    }
}