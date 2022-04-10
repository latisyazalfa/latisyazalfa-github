import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double saldo = scan.nextDouble();
        double setoran = scan.nextDouble();
        
        saldo(saldo, setoran);
    }
    
    public static void saldo (double saldo, double setoran){
        double rumus = saldo+setoran-7000;
        double akhir = rumus*5/10000;
        rumus = rumus+akhir;
        
        System.out.print(rumus);
    }
}
