/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author zalfa
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nama\t : Latisya Zalfa Naila");
        System.out.println("NIM\t : 215150600111007");
        System.out.println();

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        System.out.println("Tambahan : ");
        System.out.println("Nama Merchant, Nama Produk, Harga Makanan :");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(scan.nextLine(), scan.nextLine(), scan.nextDouble()));
        DataMerchant.tampilData();
    }
}
