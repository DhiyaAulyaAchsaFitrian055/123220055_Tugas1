/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportasi;

/**
 *
 * @author ACER
 */
public class Pesawat extends Kendaraan{
    
    public Pesawat(){
        System.out.println("Ini class Pesawat");
    }
    
    @Override
    public void suara(){
        System.out.println("wuuss");
    }
    
    @Override
    public void service(){
        System.out.println("Pesawat diservice");
    }
    
    @Override
    public void berjalan(){
        System.out.println("Pesawat itu terbang");
    }
}