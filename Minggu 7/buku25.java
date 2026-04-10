public class buku25 {
    String kode, judul;
    int tahun;

    buku25(String kode, String judul, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }

    void tampil() {
        System.out.println(kode + " | " + judul + " | " + tahun);
    }
}