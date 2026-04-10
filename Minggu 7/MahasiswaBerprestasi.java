public class MahasiswaBerprestasi {
    String nama;
    int nim;
    double ipk;

    MahasiswaBerprestasi(String nama, int nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("IPK  : " + ipk);
        System.out.println("----------------------");
    }
}