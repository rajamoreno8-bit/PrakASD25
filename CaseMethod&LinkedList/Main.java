import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoubleLinkedListAntrian antrian =
                new DoubleLinkedListAntrian();

        DoubleLinkedListPesanan pesanan =
                new DoubleLinkedListPesanan();

        int pilih;

        do {

            System.out.println("\n============================");
            System.out.println(" SISTEM RESTO ROYAL DELISH ");
            System.out.println("============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String hp = sc.nextLine();

                    Pembeli pembeli =
                            new Pembeli(nama, hp);

                    antrian.tambahAntrian(pembeli);

                    break;

                case 2:

                    antrian.cetakAntrian();

                    break;

                case 3:

                    NodeAntrian keluar =
                            antrian.hapusAntrian();

                    if (keluar != null) {

                        System.out.println(
                                "\nPembeli dipanggil : " +
                                keluar.pembeli.namaPembeli
                        );

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan p =
                                new Pesanan(
                                        kode,
                                        namaPesanan,
                                        harga
                                );

                        pesanan.tambahPesanan(
                                p,
                                keluar.pembeli.namaPembeli
                        );

                        System.out.println(
                                "Pesanan berhasil ditambahkan!"
                        );
                    }

                    break;

                case 4:

                    pesanan.tampilPesanan();

                    break;

                case 5:

                    System.out.println("Program selesai.");

                    break;

                default:

                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 5);
    }
}