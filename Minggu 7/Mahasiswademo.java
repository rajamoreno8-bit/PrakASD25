import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Kelas  : " + kelas);
        System.out.println("IPK    : " + ipk);
        System.out.println("---------------------------");
    }
}

class MahasiswaBerprestasi {
    Mahasiswa[] listMhs = new Mahasiswa[5];
    int idx = 0;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
        }
    }

    // Sequential Search
    int sequentialSearch(double cari) {
        for (int i = 0; i < idx; i++) {
            if (listMhs[i].ipk == cari) {
                return i;
            }
        }
        return -1;
    }

    // Sorting dulu (biar Binary Search benar)
    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].ipk > listMhs[j + 1].ipk) {
                    Mahasiswa temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }

    // Binary Search
    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (listMhs[mid].ipk == cari) {
                return mid;
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double cari, int pos) {
        if (pos != -1) {
            System.out.println("Data ditemukan di index: " + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void tampilDataSearch(int pos) {
        if (pos != -1) {
            listMhs[pos].tampilInformasi();
        }
    }
}

public class MahasiswaDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        list.tambah(new Mahasiswa("001", "Andi", "1A", 3.4));
        list.tambah(new Mahasiswa("002", "Budi", "1B", 3.6));
        list.tambah(new Mahasiswa("003", "Caca", "1A", 3.8));
        list.tambah(new Mahasiswa("004", "Deni", "1C", 3.2));
        list.tambah(new Mahasiswa("005", "Eka", "1B", 3.5));

        System.out.println("=== DATA MAHASISWA ===");
        list.tampil();

        // Sequential Search
        System.out.print("Masukkan IPK (Sequential): ");
        double cari = sc.nextDouble();

        int pos = list.sequentialSearch(cari);
        list.tampilPosisi(cari, pos);
        list.tampilDataSearch(pos);

        // WAJIB SORT sebelum Binary Search
        list.bubbleSort();

        // Binary Search
        System.out.print("Masukkan IPK (Binary): ");
        double cari2 = sc.nextDouble();

        int pos2 = list.findBinarySearch(cari2, 0, list.idx - 1);
        list.tampilPosisi(cari2, pos2);
        list.tampilDataSearch(pos2);
    }
}