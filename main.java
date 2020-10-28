package ba.unsa.etf.rpr;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        System.out.println("Unesite prvi broj");
        Scanner in = new Scanner(System.in);
        int prvi=in.nextInt();
        System.out.println("Unesite drugi broj");
        int drugi = in.nextInt();
        System.out.println("Prvi broj je " + prvi + ", a drugi broj je " + drugi);
    } 
}
