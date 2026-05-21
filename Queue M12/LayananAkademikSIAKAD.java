import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AntrianLayanan antrian = new AntrianLayanan(5);

        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN AKADEMIK ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cetak Semua Antrian");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);

                    antrian.Enqueue(m);
                    break;

                case 2:
                    Mahasiswa keluar = antrian.Dequeue();
                    System.out.println("Mahasiswa dipanggil:");
                    keluar.tampilkanData();
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.getJumlahAntrian();
                    break;

                case 6:
                    antrian.lihatAkhir();
                    break;
            }

        } while (pilihan != 0);
    }
}