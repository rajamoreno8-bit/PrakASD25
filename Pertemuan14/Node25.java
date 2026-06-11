package Pertemuan14;

public class Node25 {
    Mahasiswa25 mahasiswa;
    Node25 left;
    Node25 right;

    public Node25(Mahasiswa25 mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Node25(Node25 left, Mahasiswa25 mahasiswa, Node25 right) {
        this.left = left;
        this.mahasiswa = mahasiswa;
        this.right = right;
    }
}