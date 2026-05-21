public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void Enqueue(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }

            data[rear] = mhs;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa mhs = data[front];
        size--;

        if (size == 0) {
            front = rear = -1;
        } else {
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }

        return mhs;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            int i = front;

            while (i != rear) {
                data[i].tampilkanData();
                System.out.println("-------------------");
                i = (i + 1) % max;
            }

            data[i].tampilkanData();
            System.out.println("-------------------");
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void getJumlahAntrian() {
        System.out.println("Jumlah antrian : " + size);
    }

    public void lihatAkhir() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }
}