public class StackTugasMahasiswa {
    Mahasiswa[] stack;
    int size;
    int top;

    StackTugasMahasiswa(int size) {
        this.size = size;
        stack = new Mahasiswa[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Mahasiswa mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah tugas.");
        }
    }

    Mahasiswa pop() {
        if (!isEmpty()) {
            Mahasiswa mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    Mahasiswa peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    Mahasiswa lihatBawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    int jumlahTugas() {
        return top + 1;
    }

    void print() {
        if (!isEmpty()) {
            System.out.println("\nDaftar Tugas Mahasiswa:");
            
            for (int i = top; i >= 0; i--) {
                System.out.println("-----------------------");
                stack[i].tampilInformasi();
            }

            System.out.println("-----------------------");
        } else {
            System.out.println("Stack kosong!");
        }
    }

    String konversiDesimalKeBiner(int nilai) {
        StackKonversi stackKonversi = new StackKonversi();

        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonversi.push(sisa);
            nilai = nilai / 2;
        }

        String biner = "";

        while (!stackKonversi.isEmpty()) {
            biner += stackKonversi.pop();
        }

        return biner;
    }
}