/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zalfa
 */
import java.util.Scanner;
public class DataMerchant {
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant[] mch = new Merchant[DataMerchant.merc.length + 1];
        for (int i = 0; i < DataMerchant.merc.length; i++) {
            mch[i] = DataMerchant.merc[i];
        }
        mch[DataMerchant.merc.length] = merchant;
        return mch;
    }

    public static void tampilData() {
        for (Merchant mch1 : merc) {
            System.out.println("==== Tampilan Data Merchant UBFood ====");
            System.out.println("Nama Merchant  : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk    : " + mch1.getNamaProduk());
            System.out.println("Harga          : " + (int) mch1.getHargaMakanan());
        }
    }
}

