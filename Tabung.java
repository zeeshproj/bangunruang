/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author asus
 */
public class Tabung extends inheritance{
    double jarijari;
    double tinggi;
   
    
    @Override
    double volume(){
        double volume = (double) (Math.PI*jarijari*jarijari*tinggi);
        System.out.println("Volume Tabung : " + volume);
        return volume;
    }
}
