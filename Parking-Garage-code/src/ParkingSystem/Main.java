package ParkingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GarageMachine garage = new GarageMachine();
        MangerScreen mange_screen = new MangerScreen();
        System.out.println("---Welcome---");
        System.out.println("1. Driver Mode");
        System.out.println("2. Manager Mode");
        System.out.println("3. Exit");
        int choice;
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        while (true) {
            if (choice == 1) {
                while (true) {
                    int choice_fun;
                    System.out.println("---Driver Mode---");
                    System.out.println("1. Park in");
                    System.out.println("2. Change Mode");
                    System.out.println("3. Exit");
                    choice_fun = s.nextInt();
                    if (choice_fun == 1) {
                        garage.enterInfoButton();
                    } else if (choice_fun == 2) {
                        choice = 2;
                        break;
                    } else if (choice_fun == 3) {
                        choice = 3;
                        return;
                    } else {
                        System.out.println("Invalid choice");
                        choice_fun = s.nextInt();
                    }

                }
            } else if (choice == 2) {
                while (true) {
                    int choice_fun;
                    System.out.println("---Manager Mode---");
                    System.out.println("1. Set slots");
                    System.out.println("2. Display available Slots");
                    System.out.println("3. Change Mode");
                    System.out.println("4. Exit");
                    choice_fun = s.nextInt();
                    if (choice_fun == 1) {
                        mange_screen.enterSlotsDetailsButton();
                    } else if (choice_fun == 2) {
                        mange_screen.showAvalSlotsButton();
                    } else if (choice_fun == 3) {
                        choice = 1;
                        break;
                    } else if (choice_fun == 4) {
                        choice = 3;
                        break;
                    } else {
                        System.out.println("Invalid choice");
                        choice_fun = s.nextInt();
                    }
                }
            } else if (choice == 3) {
                return;
            } else {
                System.out.println("Invalid choice");
                choice = s.nextInt();
            }
        }

    }
}
