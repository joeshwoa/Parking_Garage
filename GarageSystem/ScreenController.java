/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sofwareproject;
import java.util.ArrayList;
/**
 *
 * @author Google
 */
public class ScreenController {
    public long showIncome(){
        long income = 0;
        
        return income;
    };
    public int showNumOfVehicle(){
    int num=0;
    return num;};
    public  void showMassage(){
    };
    public ArrayList<String> showAvalSlots(){
    ArrayList<String> garage=new ArrayList();
       
       for(int i=0;i<20;i++){
           garage.add(("A"+(i+1)));
           i++;
       }
      for(int i=20;i<40;i++){
          int r=19;
          garage.add(((i-r)+"B"));
          i++;
       }
     for(int i=40;i<60;i++){
         int r=39;
          garage.add(((i-r)+"C"));
           i++;
       } 
        for(int i=60;i<80;i++){
            int r=59;
           garage.add(((i-r)+"D"));
           i++;
       }
        for(int i=80;i<100;i++){
            int r=79;
           garage.add(((i-r)+"E"));
           i++;
       }
//        for (String garage1 : garage) {
//            System.out.println(garage1);
//        }
        
       ArrayList<String> AvlSlots=new ArrayList();
         for(int i=0;i<garage.size();i++){
           if(i<20){ 
          if(garage.get(i)==null){
             AvlSlots.add((i+"A"));
          }}
           if(i<40&&i>=20){ 
              int r=19;
          if(garage.get(i)==null){
             AvlSlots.add(((i-r)+"B"));
          }}
           if(i>=40&&i<60){ 
             int r=39;
          if(garage.get(i)==null){
              AvlSlots.add(((i-r)+"C"));
          }}
           if(i>=60&&i<80){
               int r=59;
              if(garage.get(i)==null){
            AvlSlots.add(((i-r)+"D"));
          }}
           if(i>=80&&i<100){ 
               int r=79;
          if(garage.get(i)==null){
            AvlSlots.add(((i-r)+"F"));
            
          }}}
       
            
        return AvlSlots;
       
    }
    
    
    }
    

