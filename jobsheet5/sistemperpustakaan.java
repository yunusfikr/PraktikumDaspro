package jobsheet5;
import java.util.Scanner;
public class sistemperpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ktm, regisonline;

        System.out.print("membawa ktm? (true/false) ");
        ktm = sc.nextBoolean();
        System.out.print("sudah registrasi online? (true/false) ");
        regisonline = sc.nextBoolean();

        if (ktm || regisonline) {
            System.out.println("Boleh masuk");
        }else{
            System.out.println("Ditolak masuk");
        }
    }
}
