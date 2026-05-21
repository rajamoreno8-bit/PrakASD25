
public class QueueMain00 {
    public static void main(String[] args) {

        QueueLinkedList00 q = new QueueLinkedList00();

        Mahasiswa00 m1 = new Mahasiswa00("101", "Rama", "TI-1A", 3.7);
        Mahasiswa00 m2 = new Mahasiswa00("102", "Nanda", "TI-1B", 3.8);
        Mahasiswa00 m3 = new Mahasiswa00("103", "Rafi", "TI-1C", 3.6);

        q.enqueue(m1);
        q.enqueue(m2);
        q.enqueue(m3);

        System.out.println("Isi Antrian:");
        q.print();

        q.peekFront();
        q.peekRear();

        q.jumlahAntrian();

        System.out.println("\nPanggil Antrian");
        q.dequeue();

        q.print();

        q.jumlahAntrian();

        q.clear();
    }
}