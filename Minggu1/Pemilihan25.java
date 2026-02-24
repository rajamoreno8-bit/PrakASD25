package Minggu1;

import java.util.Scanner;

public class Pemilihan25 {

    public static void main(String[] args) {
        Scanner raja = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==================================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = raja.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = raja.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = raja.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = raja.nextDouble();

        System.out.println("==================================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("nilai tidak valid");
            System.out.println("==================================");
            return;
        }

        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
        String nilaiHuruf, keterangan;

        if (nilaiAkhir > 80) nilaiHuruf = "A";
        else if (nilaiAkhir > 73) nilaiHuruf = "B+";
        else if (nilaiAkhir > 65) nilaiHuruf = "B";
        else if (nilaiAkhir > 60) nilaiHuruf = "C+";
        else if (nilaiAkhir > 50) nilaiHuruf = "C";
        else if (nilaiAkhir > 39) nilaiHuruf = "D";
        else nilaiHuruf = "E";

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C"))
            keterangan = "LULUS";
        else
            keterangan = "TIDAK LULUS";

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Keterangan  : " + keterangan);
        System.out.println("==================================");

        raja.close();
    }
}