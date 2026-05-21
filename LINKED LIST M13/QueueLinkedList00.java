package Pertemuan12;

public class QueueLinkedList00 {
    Node00 front;
    Node00 rear;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false;
    }

    void enqueue(Mahasiswa00 data) {
        Node00 newNode = new Node00(data, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Data dipanggil:");
            front.data.tampilInformasi();

            front = front.next;

            if (front == null) {
                rear = null;
            }

            size--;
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampilInformasi();
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampilInformasi();
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node00 temp = front;

            while (temp != null) {
                temp.data.tampilInformasi();
                System.out.println("----------------");
                temp = temp.next;
            }
        }
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }
}