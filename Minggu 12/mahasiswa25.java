public class mahasiswa25 {

    String nim, nama, kelas;
    int nilai;

    mahasiswa25(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Nilai : " + nilai);
    }

    public static void main(String[] args) {

        mahasiswa25 mhs = new mahasiswa25("123", "Raja", "TI-1A");

        mhs.tugasDinilai(90);

        mhs.tampilInformasi();
    }
}