/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ScreenController {
    private Slots s = new Slots();

    ScreenController() {
    }

    public long showIncome() {
        long income = 0;

        return income;
    }

    ;

    public int showNumOfVehicle() {
        int num = 0;
        return num;
    }

    ;

    public void showMassage() {
    }

    ;

    public ArrayList<Slot> showAvalSlots() {
        ArrayList<Slot> AvlSlots;
        AvlSlots = s.GetAvailableSlots();

        return AvlSlots;

    }

    public void EnterSlotsDetails() {
        s.clear();
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
            s.SetSlotsDetails(width, depth, id);
        }
    }


}
    

