/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan memilih untuk menggunakan rumus apa saja? ");
        String br = input.nextLine();
        
        switch (br) {
            case "Bola":
                Bola bola = new Bola();
                System.out.println("Rumus Volume Bola adalah = (PI * r * r : 4/3");
                System.out.print("r : ");
                double er = input.nextDouble();
                bola.jarijari = er;
                bola.volume();
                break;
                
                
            case "Kubus":
                Kubus kub = new Kubus();
                System.out.println("Rumus Volume Kubus adalah : ( s * s * s)");
                System.out.print("s : ");
                double es = input.nextDouble();
                kub.s =  es;
                kub.volume();
                break;
                
            case "LimasSegitiga":
                LimasSegitiga lim  = new LimasSegitiga();
                System.out.println("Rumus Volume Limas Segitiga adalah : 1/3 * Luas Alas * Tinggi");
                System.out.println("Luas alas : ");
                double luasalas = input.nextDouble();
                System.out.println("Tinggi");
                double tinggi = input.nextDouble();
                
                lim.luasalas = luasalas;
                lim.tinggi = tinggi;
                lim.volume();
                break;
                
            case "Tabung":
                Tabung bung = new Tabung();
                System.out.println("Rumus volume tabung adalah : PI * jari jari * jari jari * Tinggi ");
                System.out.print("r : ");
                double tinggit = input.nextDouble();
                bung.tinggi = tinggit;
                double jarijar = input.nextDouble();
                bung.tinggi = input.nextDouble();
                bung.volume();
                break;
                
            default:
                System.out.println("Rumus tidak ada kontol");
                
                
                
                
            
            
        }
        
       
                
    }
    
}
