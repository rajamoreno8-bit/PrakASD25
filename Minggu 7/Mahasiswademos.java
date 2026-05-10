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

        
        System.out.print("Masukkan IPK (Sequential): ");
        double cari = sc.nextDouble();

        int pos = list.sequentialSearch(cari);
        list.tampilPosisi(cari, pos);
        list.tampilDataSearch(pos);

        
        list.bubbleSort();

        
        System.out.print("Masukkan IPK (Binary): ");
        double cari2 = sc.nextDouble();

        int pos2 = list.findBinarySearch(cari2, 0, list.idx - 1);
        list.tampilPosisi(cari2, pos2);
        list.tampilDataSearch(pos2);
    }
}