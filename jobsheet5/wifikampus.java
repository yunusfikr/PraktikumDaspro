package jobsheet5;
import java.util.Scanner;

public class wifikampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengguna;
        int jml_sks;

        System.out.print("input pengguna: ");
        pengguna = sc.nextLine();

        if (pengguna.equals("dosen")) {
            System.out.println("Akses wifi diberikan (dosen)");
        }else if (pengguna.equals("mahasiswa")) {
            System.out.print("input jumlah sks: ");
            jml_sks = sc.nextInt();
            if (jml_sks >= 12) {
                System.out.println("Akses diberikan (mahasiswa aktif)");
            }else{
                System.out.println("Akses ditolak, sks kurang dari 12");
            }
        }else{
            System.out.println("Akses ditolak");
        }
    }
}
