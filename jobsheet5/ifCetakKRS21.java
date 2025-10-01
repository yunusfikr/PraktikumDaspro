package jobsheet5;
import java.util.Scanner; 

class ifCetakKRS21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean uktlunas;
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        uktlunas = sc.nextBoolean();
        
        String pesan = (uktlunas) ? "Pembayaran UKT terverifikasi\nsilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
    }

}