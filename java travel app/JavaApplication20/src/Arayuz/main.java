/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arayuz;

import java.util.ArrayList;

public class main {
    public static ArrayList<Company> sirketler = new ArrayList<>();
    public static Company hazirSirket = null;
    public static void main(String[] args) {

       sirketler.add(new Company("A","a"));
       sirketler.add(new Company("B","b"));
       sirketler.add(new Company("C","c"));
       sirketler.add(new Company("D","d"));
       sirketler.add(new Company("F","f"));
       Ev ev = new Ev();
       ev.setVisible(true);

    }


}