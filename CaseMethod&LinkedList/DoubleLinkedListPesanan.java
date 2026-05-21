public class DoubleLinkedListPesanan {

    NodePesanan head;
    NodePesanan tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan pesanan,
                              String namaPembeli) {

        NodePesanan newNode =
                new NodePesanan(null,
                        pesanan,
                        namaPembeli,
                        null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sorting() {

        if (head == null) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;

            NodePesanan current = head;

            while (current.next != null) {

                if (current.pesanan.namaPesanan.compareToIgnoreCase(
                        current.next.pesanan.namaPesanan) > 0) {

                    Pesanan tempPesanan = current.pesanan;
                    String tempPembeli = current.namaPembeli;

                    current.pesanan =
                            current.next.pesanan;

                    current.namaPembeli =
                            current.next.namaPembeli;

                    current.next.pesanan =
                            tempPesanan;

                    current.next.namaPembeli =
                            tempPembeli;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    public void tampilPesanan() {

        if (isEmpty()) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sorting();

        int total = 0;

        System.out.println("\n=== LAPORAN PESANAN ===");
        System.out.println("Kode\tNama\t\tHarga\tPembeli");

        NodePesanan current = head;

        while (current != null) {

            System.out.println(
                    current.pesanan.kodePesanan + "\t" +
                    current.pesanan.namaPesanan + "\t\t" +
                    current.pesanan.harga + "\t" +
                    current.namaPembeli
            );

            total += current.pesanan.harga;

            current = current.next;
        }

        System.out.println("\nTotal Pendapatan : Rp " + total);
    }
}