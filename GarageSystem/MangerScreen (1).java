
package com.mycompany.sofwareproject;
import java.util.ArrayList;
/**
 *
 * @author Google
 */
public class MangerScreen {

    /**
     *
     */
    ScreenController s = null;
    public  void showMassagePupup(){
    }
    public  void showIncomeButton(/*data time formatter*/ ){
        long inco;
    
    inco=s.showIncome(/*data time formatter*/);
    
    }
    public  void showNumOfVehicleButton(/*data time formatter*/ ){
        int num=0;
        num=s.showNumOfVehicle();
    }
    public void showAvalSlotsButton(){
        ArrayList<String> place=s.showAvalSlots();
        System.out.println(place);
 
}
}