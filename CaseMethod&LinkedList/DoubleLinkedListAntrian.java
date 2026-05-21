public class DoubleLinkedListAntrian {

    NodeAntrian head;
    NodeAntrian tail;
    int nomor = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli pembeli) {

        NodeAntrian newNode =
                new NodeAntrian(null, nomor++, pembeli, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Antrian berhasil ditambahkan!");
    }

    public void cetakAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\n=== DAFTAR ANTRIAN ===");
        System.out.println("No\tNama\t\tNo HP");

        NodeAntrian current = head;

        while (current != null) {

            System.out.println(
                    current.nomorAntrian + "\t" +
                    current.pembeli.namaPembeli + "\t\t" +
                    current.pembeli.noHp
            );

            current = current.next;
        }
    }

    public NodeAntrian hapusAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }

        NodeAntrian removed = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return removed;
    }
}