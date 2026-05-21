public class NodeAntrian {
    int nomorAntrian;
    Pembeli pembeli;
    NodeAntrian prev;
    NodeAntrian next;

    public NodeAntrian(NodeAntrian prev,
                       int nomorAntrian,
                       Pembeli pembeli,
                       NodeAntrian next) {

        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.pembeli = pembeli;
        this.next = next;
    }
}