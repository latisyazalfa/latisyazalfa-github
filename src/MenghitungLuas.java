import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int persegi, sisi;
        int segetiga, tinggi, alas;
        int lingkaran, jari;
        int menu = scan.nextInt();      
        
        if (menu == 1){
            sisi = scan.nextInt();
            
            persegi(sisi);
        }
        
        else if (menu == 2){
            tinggi = scan.nextInt();
            alas = scan.nextInt();
            
            segitiga(tinggi, alas);
        }
        
        else if (menu == 3){
            jari = scan.nextInt();
            
            lingkaran(jari);
        }
        
        else {
            System.out.print("Input yang anda masukan tidak sesuai");
        }
    }
    
    
     static void persegi (int sisi){
         int rumus = sisi*sisi;
         
         System.out.print(rumus);
     }
    
     static void segitiga (int tinggi, int alas){
         int rumus = alas*tinggi*1/2;
         
         System.out.print(rumus);
     }
    
    static void lingkaran (int jari){
        if (jari == 7){
            double rumus = 22/7*jari*jari;
            int akhir = (int) rumus;
            
            System.out.print((double)akhir);
        }
        else {
            double rumus = 3.14*jari*jari;
            int akhir = (int) rumus;
            
            System.out.print((double) akhir);
        }
    }
}