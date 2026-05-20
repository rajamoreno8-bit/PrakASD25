import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StackTugasMahasiswa stack = new StackTugasMahasiswa(5);

        int pilih;

        do {
            System.out.println("\n=== MENU STACK TUGAS ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Nilai Tugas");
            System.out.println("3. Lihat Tugas Teratas");
            System.out.println("4. Lihat Semua Tugas");
            System.out.println("5. Lihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = scan.nextLine();

                    System.out.print("Nama  : ");
                    String nama = scan.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, kelas);
                    stack.push(mhs);

                    System.out.println("Tugas berhasil dikumpulkan!");
                    break;

                case 2:
                    Mahasiswa dinilai = stack.pop();

                    if (dinilai != null) {
                        System.out.print("Masukkan nilai untuk "
                                + dinilai.nama + ": ");
                        int nilai = scan.nextInt();

                        dinilai.tugasDinilai(nilai);

                        System.out.println("Tugas sudah dinilai.");
                        System.out.println("Nilai biner: "
                                + stack.konversiDesimalKeBiner(nilai));
                    }
                    break;

                case 3:
                    Mahasiswa atas = stack.peek();

                    if (atas != null) {
                        System.out.println("\nTugas Teratas:");
                        atas.tampilInformasi();
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    Mahasiswa bawah = stack.lihatBawah();

                    if (bawah != null) {
                        System.out.println("\nTugas Pertama:");
                        bawah.tampilInformasi();
                    }
                    break;

                case 6:
                    System.out.println("Jumlah tugas terkumpul: "
                            + stack.jumlahTugas());
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);

        scan.close();
    }
}