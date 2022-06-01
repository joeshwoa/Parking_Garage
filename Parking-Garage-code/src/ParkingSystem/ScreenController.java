/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ScreenController {
    private static ScreenController SC;

    private ScreenController() {
    }
    public static ScreenController getInstance()
    {
        if(SC==null)
            SC= new ScreenController();
        return SC;
    }
    public long showIncome() {
        ParkingMang p = ParkingMang.getInstance();
        return p.getIncome();
    }

    public int showNumOfVehicle() {
        ParkingMang p = ParkingMang.getInstance();
        return p.getNumOfVehicle();
    }

    public void showMassage() {
    }

    public ArrayList<Slot> showAvailSlots() {
        ArrayList<Slot> AvlSlots;
        AvlSlots = Slots.getInstance().getAvailableSlots();

        return AvlSlots;
    }

    public void enterSlotsDetails() {
        Slots.getInstance().clearPlaces();
        int num_of_slots;
        //Take from the manager the number of slots in the garage
        System.out.println("Enter Number of Slots");
        Scanner scan = new Scanner(System.in);
        num_of_slots = scan.nextInt();
        //Take the Dimensions of each Slot
        for (int i = 0; i < num_of_slots; i++) {
            double width, depth;
            String id;
            System.out.println("Enter Width , Depth and slot ID");
            width = scan.nextDouble();
            depth = scan.nextDouble();
            id = scan.nextLine();
            boolean flag = Slots.getInstance().setSlotsDetails(width, depth, id);
            if(!flag){
                System.out.println("Can't add this Slot!");
                //to not count this slot.
                i--;
            }
        }
    }
}
    

