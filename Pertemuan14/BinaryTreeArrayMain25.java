package Pertemuan14;

public class BinaryTreeArrayMain25 {

    public static void main(String[] args) {

        BinaryTreeArray25 bta = new BinaryTreeArray25();

        Mahasiswa25 mhs1 = new Mahasiswa25("244160121", "Ali", "A", 3.57);
        Mahasiswa25 mhs2 = new Mahasiswa25("244160185", "Candra", "C", 3.41);
        Mahasiswa25 mhs3 = new Mahasiswa25("244160221", "Badar", "B", 3.75);
        Mahasiswa25 mhs4 = new Mahasiswa25("244160220", "Dewi", "B", 3.35);

        Mahasiswa25 mhs5 = new Mahasiswa25("244160131", "Devi", "A", 3.40);
        Mahasiswa25 mhs6 = new Mahasiswa25("244160205", "Ehsan", "D", 3.61);
        Mahasiswa25 mhs7 = new Mahasiswa25("244160170", "Fizi", "B", 3.86);

        Mahasiswa25[] dataMahasiswa = {
                mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null
        };

        int idxLast = 6;

        bta.populateData(dataMahasiswa, idxLast);

        System.out.println("InOrder Traversal Mahasiswa:");
        bta.traverseInOrder(0);
    }
}