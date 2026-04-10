

public class peminjaman25 {
     Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int denda;

    peminjaman25(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        int telat = lamaPinjam - batas;

        if (telat > 0) {
            denda = telat * 2000;
        } else {
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " +
                buku.judul + " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}
