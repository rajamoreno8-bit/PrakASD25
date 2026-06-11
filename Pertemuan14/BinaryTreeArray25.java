package Pertemuan14;

public class BinaryTreeArray25 {

    Mahasiswa25[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray25() {
        dataMahasiswa = new Mahasiswa25[10];
    }

    void populateData(Mahasiswa25[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Tugas
    void add(Mahasiswa25 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            dataMahasiswa[++idxLast] = data;
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}