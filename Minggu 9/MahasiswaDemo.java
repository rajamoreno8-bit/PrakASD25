import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa stack = new StackTugasMahasiswa(5);

        int pilih;

        do {
            System.out.println("\n=== MENU STACK TUGAS ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Nilai Tugas (Pop)");
            System.out.println("3. Lihat Tugas Teratas");
            System.out.println("4. Tampilkan Semua");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, kelas);
                    stack.push(mhs);
                    break;

                case 2:
                    Mahasiswa nilaiMhs = stack.pop();
                    if (nilaiMhs != null) {
                        System.out.print("Masukkan nilai: ");
                        int nilai = scan.nextInt();
                        nilaiMhs.tugasDinilai(nilai);
                        System.out.println("Data setelah dinilai:");
                        nilaiMhs.tampil();
                    }
                    break;

                case 3:
                    Mahasiswa lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas teratas:");
                        lihat.tampil();
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}