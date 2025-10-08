package jobsheet5;
import java.util.Scanner;

public class casemethod1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String alpabet1, alpabet2, lulusmatkul1, lulusmatkul2, lulussmt;

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String NIM = sc.nextLine();
        System.out.println("");
        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS  : ");
        int uts1 = sc.nextInt();
        System.out.print("Nilai UAS  : ");
        int uas1 = sc.nextInt();
        System.out.print("Nilai Tugas: ");
        int tugas1 = sc.nextInt();
        System.out.println("");
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS  : ");
        int uts2 = sc.nextInt();
        System.out.print("Nilai UAS  : ");
        int uas2 = sc.nextInt();
        System.out.print("Nilai Tugas: ");
        int tugas2 = sc.nextInt();

        double matkul1 = uts1 * 0.3 + uas1 * 0.4 + tugas1 * 0.3;
        double matkul2 = uts2 * 0.3 + uas2 * 0.4 + tugas2 * 0.3;

        if (matkul1 <= 39) {
            alpabet1 = "E";
        }else if (matkul1 <=50) {
            alpabet1 = "D";
        }else if (matkul1 <= 60) {
            alpabet1 = "C";
        }else if (matkul1 <= 65) {
            alpabet1 = "C+";
        }else if (matkul1 <= 73) {
            alpabet1 = "B";
        }else if (matkul1 <= 80) {
            alpabet1 = "B+";
        }else {
            alpabet1 = "A";
        }

        if (matkul2 <= 39) {
            alpabet2 = "E";
        }else if (matkul2 <=50) {
            alpabet2 = "D";
        }else if (matkul2 <= 60) {
            alpabet2 = "C";
        }else if (matkul2 <= 65) {
            alpabet2 = "C+";
        }else if (matkul2 <= 73) {
            alpabet2 = "B";
        }else if (matkul2 <= 80) {
            alpabet2 = "B+";
        }else {
            alpabet2 = "A";
        }

        if (matkul1 >= 60) {
            lulusmatkul1 = "LULUS";
        }else{
            lulusmatkul1 = "TIDAK LULUS";
        }

         if (matkul2 >= 60) {
            lulusmatkul2 = "LULUS";
        }else{
            lulusmatkul2 = "TIDAK LULUS";
        }

        double ratarata = (matkul1 + matkul2) / 2;
       
        if (ratarata >= 70) {
            lulussmt = "LULUS";
        }else{
            lulussmt = "TIDAK LULUS (Rata-rata < 70)";
        }

        System.out.println("");
        System.out.println("================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama : "+ nama);
        System.out.println("NIM  : "+ NIM);

        System.out.println("Mata Kuliah\t\tUTS  UAS   Tugas   Nilai Akhir   Nilai Huruf   Status");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t"+uts1+"   "+uas1+"     "+tugas1+"        "+matkul1+"\t     "+alpabet1+"\t\t"+lulusmatkul1);
        System.out.println("Struktur Data\t\t"+uts2+"   "+uas2+"     "+tugas2+"        "+matkul2+"\t     "+alpabet2+"\t\t"+lulusmatkul2);
        System.out.println("");
        System.out.println("Rata-rata Nilai Akhir: "+ratarata);
        System.out.println("Status Semester\t: "+lulussmt);
    }
}