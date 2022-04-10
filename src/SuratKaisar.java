import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
   
        Scanner scan = new Scanner(System.in);
        String Awalan = scan.nextLine();
        int N = scan.nextInt();
        String kata ="";
        System.out.println(perpindahan(kata,N,Awalan));
  }
        public static String perpindahan (String kata, int N, String Awalan){
        kata = "";
        char alphabet;
        for(int i=0; i < Awalan.length();i++){
            alphabet = Awalan.charAt(i);
                if(alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char) (alphabet + N);
                    if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                    }
                kata = kata + alphabet;
                }
                else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + N);    
                    if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                    }
                    kata = kata + alphabet;
                    }else {
             kata = kata + alphabet;   
            }  
    }   
        return kata;
        }     
}

