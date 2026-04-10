import java.util.Scanner;

public class main25 {

    static Peminjaman[] pinjam; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa m1 = new Mahasiswa("22001", "Andi", "Teknik Informatika");
        Mahasiswa m2 = new Mahasiswa("22002", "Budi", "Teknik Informatika");
        Mahasiswa m3 = new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");

        Buku b1 = new Buku("B001", "Algoritma", 2020);
        Buku b2 = new Buku("B002", "Basis Data", 2019);
        Buku b3 = new Buku("B003", "Pemrograman", 2021);
        Buku b4 = new Buku("B004", "Fisika", 2024);

        pinjam = new Peminjaman[] {
            new Peminjaman(m1, b1, 7),
            new Peminjaman(m2, b2, 3),
            new Peminjaman(m3, b3, 10),
            new Peminjaman(m3, b4, 6),
            new Peminjaman(m1, b2, 4)
        };

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Data Mahasiswa & Buku");
            System.out.println("2. Tampilkan Data Peminjaman");
            System.out.println("3. Hitung Denda");
            System.out.println("4. Urutkan Denda (Insertion Sort)");
            System.out.println("5. Cari berdasarkan NIM (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nData Mahasiswa:");
                    m1.tampil();
                    m2.tampil();
                    m3.tampil();

                    System.out.println("\nData Buku:");
                    b1.tampil();
                    b2.tampil();
                    b3.tampil();
                    b4.tampil();
                    break;

                case 2:
                    System.out.println("\nData Peminjaman:");
                    tampilPeminjaman();
                    break;

                case 3:
                    System.out.println("\nDenda sudah dihitung otomatis:");
                    tampilPeminjaman();
                    break;

                case 4:
                    insertionSort();
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    tampilPeminjaman();
                    break;

                case 5:
                    insertionSortNIM();
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();
                    binarySearch(cari);
                    break;
            }
        } while (pilih != 0);

        sc.close();
    }

    static void tampilPeminjaman() {
        for (Peminjaman p : pinjam) {
            p.tampil();
        }
    }

    static void insertionSort() {
        for (int i = 1; i < pinjam.length; i++) {
            Peminjaman temp = pinjam[i];
            int j = i - 1;

            while (j >= 0 && pinjam[j].denda < temp.denda) {
                pinjam[j + 1] = pinjam[j];
                j--;
            }
            pinjam[j + 1] = temp;
        }
    }

    static void insertionSortNIM() {
        for (int i = 1; i < pinjam.length; i++) {
            Peminjaman temp = pinjam[i];
            int j = i - 1;

            while (j >= 0 && pinjam[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                pinjam[j + 1] = pinjam[j];
                j--;
            }
            pinjam[j + 1] = temp;
        }
    }

    static void binarySearch(String nim) {
        int left = 0, right = pinjam.length - 1;
        boolean ketemu = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            int hasil = pinjam[mid].mhs.nim.compareTo(nim);

            if (hasil == 0) {
                pinjam[mid].tampil();
                ketemu = true;
                break;
            } else if (hasil < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan");
        }
    }
}