/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arayuz;

import java.util.ArrayList;

public class Trip {
    static public ArrayList<Trip> aracList = new ArrayList<>();

    public Vehicle aracTuru;
    public String firmaAd;


    public Trip(Vehicle aracTuru, String firmaAd) {
        this.aracTuru = aracTuru;
        this.firmaAd = firmaAd;
    }



    static public Trip otobus1FirmaA = new Trip(new Bus("Otobus1","3","20"),"A");
    static public Trip otobus2FirmaA = new Trip(new Bus("Otobus2","3","15"), "A");
    static public Trip otobus1FirmaB = new Trip(new Bus("Otobus1","3","15"), "B");
    static public Trip otobus2FirmaB = new Trip(new Bus("Otobus2","4","20"), "B");
    static public Trip otobus1FirmaC = new Trip(new Bus("Otobus1","4","20"), "C");
    static public Trip ucak2FirmaC = new Trip(new Airplane("Uçak2","5","30"), "C");
    static public Trip ucak1FirmaC = new Trip(new Airplane("Uçak1","5","30"), "C");

    static public Trip tren1FirmaD = new Trip(new Train("Tren1","1","25"), "D");
    static public Trip tren2FirmaD = new Trip(new Train("Tren2","2","25"), "D");
    static public Trip tren3FirmaD = new Trip(new Train("Tren3","2","25"), "D");
    static public Trip ucak1FirmaF = new Trip(new Airplane("Uçak1","6","30"), "F");
    static public Trip ucak2FirmaF = new Trip(new Airplane("Uçak2","6","30"), "F");


    static {
        aracList.add(Trip.otobus1FirmaA);
        aracList.add(Trip.otobus2FirmaA);
        aracList.add(Trip.otobus1FirmaB);
        aracList.add(Trip.otobus2FirmaB);
        aracList.add(Trip.otobus1FirmaC);
        aracList.add(Trip.ucak1FirmaC);
        aracList.add(Trip.ucak2FirmaC);

        aracList.add(Trip.tren1FirmaD);
        aracList.add(Trip.tren2FirmaD);
        aracList.add(Trip.tren3FirmaD);
        aracList.add(Trip.ucak1FirmaF);
        aracList.add(Trip.ucak2FirmaF);
    }
}
