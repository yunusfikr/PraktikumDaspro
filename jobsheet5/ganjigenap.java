package jobsheet5;
import java.util.Scanner;

public class ganjigenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
}
