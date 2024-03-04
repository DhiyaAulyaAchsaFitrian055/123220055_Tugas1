/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args){
        Transportasi.Mobil Avanza = new Transportasi.Mobil();
        Avanza.suara();
        
        Avanza.roda = 4;
        Avanza.jenis = "Modern";
        System.out.println("Jenis : " + Avanza.jenis);
        Avanza.bahanBakar();
        Avanza.getOli();
        Avanza.setUmur(5);
        System.out.println("Umur : " + Avanza.getUmur());
        Avanza.service();
        Avanza.mengisi();
        
        System.out.println("");
        System.out.println("");
        
        Transportasi.Pesawat Citylink = new Transportasi.Pesawat();
        Citylink.suara();
        Citylink.roda = 2;
        System.out.println("Roda : " + Citylink.roda);
        
        Avanza.berjalan();
        Citylink.berjalan();
        }
}
