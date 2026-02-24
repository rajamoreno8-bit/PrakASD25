package Minggu1;

import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner raja = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2,2,2,3,2,3,2,2};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobot = new double[mataKuliah.length];

        double total = 0;
        int totalSKS = 0;

        System.out.println("====================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================================");

        // INPUT NILAI ANGKA
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + " : ");
            nilaiAngka[i] = raja.nextDouble();

            // KONVERSI NILAI
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobot[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobot[i] = 0;
            }

            total += bobot[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = total / totalSKS;

        // OUTPUT TABEL
        System.out.println("\n====================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", 
                          "MK", "Nilai Angka", "Nilai Huruf", "Bobot");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                              mataKuliah[i],
                              nilaiAngka[i],
                              nilaiHuruf[i],
                              bobot[i]);
        }

        System.out.println("====================================");
        System.out.printf("IP Semester : %.2f\n", ip);
        System.out.println("====================================");

        raja.close();
    }
}