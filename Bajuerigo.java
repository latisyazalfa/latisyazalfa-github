
package bajuerigo;
import java.util.*;

/**
 *
 * @author zalfa
 */
public class Bajuerigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner hi = new Scanner(System.in);

        Baju object = new Baju();
        object.stok();

        System.out.print("Baju yang akan anda beli bertipe : ");
        object.jenis = hi.nextLine();

        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        object.jumlah = hi.nextInt();

        object.display();

    }
}

class Baju {
    String jenis;
    int harga;
    int jumlah;

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void stok() {
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + bajua);
        System.out.println("Baju B dengan harga " + bajub);
        System.out.println("Baju C dengan harga " + bajuc);
    }

    void harga_a() {
        if (jumlah > 100) {
            this.harga = 95000;
        } else {
            this.harga = bajua;
        }
    }

    void harga_b() {
        if (jumlah > 100) {
            this.harga = 120000;
        } else {
            this.harga = bajub;
        }
    }

    void harga_c() {
        if (jumlah > 100) {
            this.harga = 160000;
        } else {
            this.harga = bajuc;
        }
    }

    void display() {
        if (jenis.equalsIgnoreCase("a"))
            harga_a();
        else if (jenis.equalsIgnoreCase("b"))
            harga_b();
        else if (jenis.equalsIgnoreCase("c"))
            harga_c();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
    }
}
