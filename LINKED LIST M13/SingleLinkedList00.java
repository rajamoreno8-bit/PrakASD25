
public class SingleLinkedList00 {
    Node00 head;
    Node00 tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node00 temp = head;

            while (temp != null) {
                temp.data.tampilInformasi();
                System.out.println("-------------------");
                temp = temp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa00 input) {
        Node00 ndInput = new Node00(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa00 input) {
        Node00 ndInput = new Node00(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String key, Mahasiswa00 input) {
        Node00 temp = head;

        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                Node00 ndInput = new Node00(input, temp.next);
                temp.next = ndInput;

                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, Mahasiswa00 input) {
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node00 temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;

                if (temp == null) {
                    System.out.println("Index melebihi jumlah data");
                    return;
                }
            }

            Node00 ndInput = new Node00(input, temp.next);
            temp.next = ndInput;

            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }

    int indexOf(String key) {
        Node00 temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    Mahasiswa00 getData(int index) {
        Node00 temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;

            if (temp == null) {
                return null;
            }
        }

        return temp.data;
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node00 temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }
    }

    void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        Node00 temp = head;

        while (temp.next != null) {
            if ((temp.next.data.nim).equalsIgnoreCase(key)) {
                temp.next = temp.next.next;

                if (temp.next == null) {
                    tail = temp;
                }
                break;
            }

            temp = temp.next;
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node00 temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}