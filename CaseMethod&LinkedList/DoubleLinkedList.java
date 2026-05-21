public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(Mahasiswa data) {
        Node newNode = new Node(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa data) {
        Node newNode = new Node(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Node newNode = new Node(current.prev, data, current);

            current.prev.next = newNode;
            current.prev = newNode;

            size++;
        }
    }

    public void insertAfter(String key, Mahasiswa data) {
        Node current = head;

        while (current != null) {
            if (current.data.nim.equals(key)) {
                Node newNode = new Node(current, data, current.next);

                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }

                current.next = newNode;
                size++;
                return;
            }
            current = current.next;
        }

        System.out.println("Data tidak ditemukan");
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head == tail) {
            System.out.println("Data yang dihapus:");
            head.data.tampil();

            head = tail = null;
            size--;
        } else {
            System.out.println("Data yang dihapus:");
            head.data.tampil();

            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head == tail) {
            System.out.println("Data yang dihapus:");
            tail.data.tampil();

            head = tail = null;
            size--;
        } else {
            System.out.println("Data yang dihapus:");
            tail.data.tampil();

            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node current = head;

        while (current != null) {
            if (current.data.nim.equals(key)) {

                if (current.next == null) {
                    System.out.println("Tidak ada node setelah data tersebut");
                    return;
                }

                Node removed = current.next;

                System.out.println("Data yang dihapus:");
                removed.data.tampil();

                current.next = removed.next;

                if (removed.next != null) {
                    removed.next.prev = current;
                } else {
                    tail = current;
                }

                size--;
                return;
            }

            current = current.next;
        }

        System.out.println("Data tidak ditemukan");
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            System.out.println("Data yang dihapus:");
            current.data.tampil();

            current.prev.next = current.next;
            current.next.prev = current.prev;

            size--;
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            System.out.println("Data pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data index ke-" + index);
        current.data.tampil();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            Node current = head;

            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            Node current = tail;

            while (current != null) {
                current.data.tampil();
                current = current.prev;
            }
        }
    }
}