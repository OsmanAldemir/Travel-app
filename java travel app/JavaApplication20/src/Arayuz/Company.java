/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arayuz;

import java.util.ArrayList;

public class Company extends User {
    static public ArrayList<Vehicle> aracList = new ArrayList<>();
    static public String mevcutGiris;
   
    /*public ArrayList<Airplane> AirplaneList;
    public ArrayList<Train> TrainList;*/
    public Company(String username, String password) {
        super(username, password);
    }
   
    public ArrayList<Vehicle> getAracList() {
        for(Vehicle a:aracList){
          System.out.println(a.getAracTürü());
      }
        System.out.println(aracList.isEmpty());
        return aracList;
    }

    public void setAracList(ArrayList<Vehicle> aracList) {
        this.aracList = aracList;
    }
    static public void addArac(Vehicle car) {
        aracList.add(car);
      //  System.out.println(car.getAracTürü());
     
    }
    /* public void addAirplane(Airplane car) {
        AirplaneList.add(car);
    }
      public void addTrain(Train car) {
        TrainList.add(car);
    }*/
   
    @Override
    public boolean login(String username, String password) {
        return true;
    }
    public static void addcompany(Company c){
       main.sirketler.add(c);
    }
   
}
