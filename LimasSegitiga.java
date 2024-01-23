/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author asus
 */
public class LimasSegitiga extends inheritance{
    double luasalas;
    double tinggi;
    
    @Override
    double volume(){
        double volume = (luasalas*tinggi)* 1/3;
        System.out.println("Volume Limas Segitiga : " + volume);
        return volume; 
    }
    
    
}
