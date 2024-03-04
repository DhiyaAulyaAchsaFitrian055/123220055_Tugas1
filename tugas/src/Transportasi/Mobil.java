/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportasi;

/**
 *
 * @author ACER
 */
public class Mobil extends Kendaraan implements Bensin{
    private int umur;
    
    public Mobil(){
        System.out.println("Ini class Mobil");
    }
    
    private void oli(){
        System.out.println("Mobil ganti Oli");
    }
    
    @Override
    public void suara(){
        System.out.println("bremm");
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void getOli() {
        oli();
    }

    public void setUmur(int umur){
        this.umur = umur;
    }
    
    @Override
    public void service(){
        System.out.println("Mobil diservice");
    }
    
    @Override
    public void berjalan(){
        System.out.println("Mobil berjalan");
    }
    
    @Override
    public void mengisi(){
        System.out.println("Mobil mengisi bensin");
    }
}
