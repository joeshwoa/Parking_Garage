package ParkingSystem;

import java.util.Scanner;

public class GarageMachine {
    private MachineController control = new MachineController();
    public Scanner s;

    public void enterInfoButton() {
        s = new Scanner(System.in);
        System.out.println("Enter model, carId, mYear, width and depth");
        String m, cid, pmethod;
        int y;
        double w, d;
        System.out.println("Enter the parking method:");
        System.out.println("First come first served enter FC || Best fit Method enter BF: ");
        pmethod = s.nextLine();

        ParkingMethod method;
        if(pmethod.equals("FC")){
            method = new FirstComeMethod();
        }else if(pmethod.equals("BF")){
            method = new BestFitMethod();
        }else{
            System.out.println("Invalid input.");
            System.out.println("Will use the default method which is Best fit Method.");
            method = new BestFitMethod();
        }

        System.out.println("Enter model");
        m = s.nextLine();
        System.out.println("Enter carId");
        cid = s.nextLine();
        System.out.println("Enter mYear");
        y = s.nextInt();
        System.out.println("Enter width");
        w = s.nextDouble();
        System.out.println("Enter depth");
        d = s.nextDouble();

        String sid = control.sentInfo(m, cid, y, w, d, method);
        if (sid == "No") {
            System.out.println("Sorry No Avaliable Slot");
        } else {
            System.out.println("Your slot Id = " + sid);

        }

    }
    /*public void LeaveButton ()
    {
        s = new Scanner(System.in);
        String sid;
        System.out.println("Enter your slot Id");
        sid=s.nextLine();
        int p=c.Leave(sid);
        pay(p,sid);
    }*/
    /*private void pay (int cost,String slotId)
    {
        System.out.println("please enter "+cost+" egp to leave");
        System.out.println("Enter money");
        int m=s.nextInt();
        c.check(m,cost,slotId);
    }*/
    /*public void  ReturnChange (int ch)
    {
        System.out.println("tack "+ch);
        System.out.println("thank you for use our garage :)");
    }*/
    /*public void  ReturnMoney (int m)
    {
        System.out.println("tack "+m+" your money and manger will come for you");
    }*/
}
