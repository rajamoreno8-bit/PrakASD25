public class NodePesanan {
    Pesanan pesanan;
    String namaPembeli;
    NodePesanan prev;
    NodePesanan next;

    public NodePesanan(NodePesanan prev,
                       Pesanan pesanan,
                       String namaPembeli,
                       NodePesanan next) {

        this.prev = prev;
        this.pesanan = pesanan;
        this.namaPembeli = namaPembeli;
        this.next = next;
    }
}