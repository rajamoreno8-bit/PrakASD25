
public class SLLMain00 {
    public static void main(String[] args) {

        SingleLinkedList00 sll = new SingleLinkedList00();

        Mahasiswa00 mhs1 = new Mahasiswa00("22001", "Andi", "TI-1A", 3.8);
        Mahasiswa00 mhs2 = new Mahasiswa00("22002", "Budi", "TI-1B", 3.7);
        Mahasiswa00 mhs3 = new Mahasiswa00("22003", "Citra", "TI-1C", 3.9);
        Mahasiswa00 mhs4 = new Mahasiswa00("22004", "Dina", "TI-1D", 3.6);

        System.out.println("Print data awal");
        sll.print();

        System.out.println("\nTambah data di depan");
        sll.addFirst(mhs1);
        sll.print();

        System.out.println("\nTambah data di belakang");
        sll.addLast(mhs2);
        sll.print();

        System.out.println("\nInsert After");
        sll.insertAfter("22001", mhs3);
        sll.print();

        System.out.println("\nInsert At Index 2");
        sll.insertAt(2, mhs4);
        sll.print();

        System.out.println("\nData index ke-2");
        Mahasiswa00 data = sll.getData(2);

        if (data != null) {
            data.tampilInformasi();
        }

        System.out.println("\nIndex NIM 22003 : " + sll.indexOf("22003"));

        System.out.println("\nRemove First");
        sll.removeFirst();
        sll.print();

        System.out.println("\nRemove Last");
        sll.removeLast();
        sll.print();

        System.out.println("\nRemove NIM 22003");
        sll.remove("22003");
        sll.print();
    }
}