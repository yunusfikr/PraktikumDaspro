import java.util.Scanner;
public class nilaikelompok21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, keltertinggi=0, i=1;
        float totalNilai, rataNilai, nilaitertinggi=0;
        while (i<=5) {
            System.out.println("Kelompok "+i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
            System.out.print(" Nilai dari kelompok penilai "+j+": ");
            nilai = sc.nextInt();
            totalNilai += nilai;
        }
        rataNilai = totalNilai / 5;
        System.out.println("Kelompok "+i+": nilai rata-rata = "+rataNilai);

        if (rataNilai > nilaitertinggi) {
            nilaitertinggi = rataNilai;
            keltertinggi = i;
            i++;
        }else{
            i++;
        }
        }
        System.out.println("Rata-rata nilai teringgi: "+nilaitertinggi+" dari Kelompok "+keltertinggi);
    }
}
