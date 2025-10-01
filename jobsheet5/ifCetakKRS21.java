package jobsheet5;
import java.util.Scanner; 

class ifCetakKRS21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean uktlunas;
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        uktlunas = sc.nextBoolean();

        if (uktlunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");

        }
        
    }

}