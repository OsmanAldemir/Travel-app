/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arayuz;

import java.util.ArrayList;

public abstract class Vehicle {
   public ArrayList<Trip> seferler = new ArrayList<>();
   public String aracTürü;
   public String sefer;
   public String Kapasite;

    public Vehicle(String aracTürü, String sefer, String Kapasite) {
        this.aracTürü = aracTürü;
        this.sefer = sefer;
        this.Kapasite = Kapasite;
    }

    public String getAracTürü() {
        return aracTürü;
    }

    public void setAracTürü(String aracTürü) {
        this.aracTürü = aracTürü;
    }

    public String getYakitTürü() {
        return sefer;
    }

    public void setYakitTürü(String yakitTürü) {
        this.sefer = yakitTürü;
    }

    public String getKapasite() {
        return Kapasite;
    }

    public void setKapasite(String Kapasite) {
        this.Kapasite = Kapasite;
    }

    public Vehicle(String aracTürü) { 
        this.aracTürü = aracTürü;
    }
    public void seferEkle(int Seferno,int Sefergun){

    }
}