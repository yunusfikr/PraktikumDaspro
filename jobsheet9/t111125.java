package jobsheet9;
import java.util.Scanner;
public class t111125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] rspndn = new int[10][6];
        double tot = 0, rata = 0, rataprntyn=0; 

        for (int i = 0; i < rspndn.length; i++) {
            System.out.println("rspndn "+(i+1));
            for (int j = 0; j < rspndn[i].length; j++) {
                System.out.print("skor prtnyn "+(j+1)+" : ");
                rspndn[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < rspndn.length; i++) {
            rata = 0;
            for (int j = 0; j < rspndn[i].length; j++) {
                rata += rspndn[i][j];
            }
            rata = rata / rspndn[i].length;
            tot += rata;
            System.out.println("rt2 rspnd "+(i+1)+" : "+rata);
        }

        System.out.println();
       for (int j = 0; j < rspndn[0].length; j++) {
            rataprntyn = 0;
            for (int i = 0; i < rspndn.length; i++) {
                rataprntyn += rspndn[i][j];
            }
            rataprntyn /= rspndn.length;
            System.out.println("rata prtnyn " + (j+1) + " : " + rataprntyn);
        }

        tot = tot / rspndn.length;
        System.out.println();
        System.out.println("rata tot : "+tot);
    }
}